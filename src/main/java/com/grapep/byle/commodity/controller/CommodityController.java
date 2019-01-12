package com.grapep.byle.commodity.controller;

import com.grapep.byle.commodity.entity.Commodity;
import com.grapep.byle.commodity.entity.CommodityVo;
import com.grapep.byle.commodity.entity.CommodityWithBLOBs;
import com.grapep.byle.commodity.entity.CommodityWithUser;
import com.grapep.byle.commodity.service.ShowCommodityService;
import com.grapep.byle.commodity.service.UploadService;
import com.grapep.byle.common.constants.Constants;
import com.grapep.byle.common.exception.ByleException;
import com.grapep.byle.common.resp.ApiResult;
import com.grapep.byle.common.rest.BaseController;
import com.grapep.byle.kind.entity.Kind;
import com.grapep.byle.school.entity.School;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Xue
 * @date 2017/12/2 19:16
 * @description 发布内容相关
 */
@RestController
@Slf4j
@RequestMapping("commodity")
public class CommodityController extends BaseController {

    @Autowired
    private UploadService uploadService;
    @Autowired
    private ShowCommodityService showCommodityService;

    /**
     * 发布内容上传
     *
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ApiOperation(value = "发布内容上传", notes = "form表单图片文件key为file")
    @ApiImplicitParam(name = "commodityVo", dataType = "CommodityVo")
    public ApiResult<String> commodityUpload(CommodityVo commodityVo, HttpServletRequest request) {
        ApiResult<String> resp = new ApiResult<String>();
        try {
            //vo转po 解决类型不匹配问题  donghe
            CommodityWithBLOBs commodity = new CommodityWithBLOBs();
            commodity.setComdTitle(commodityVo.getComdTitle());
            commodity.setComdContent(commodityVo.getComdContent());
            //如果数据为null调用parseXXX会报空指针异常
            if (commodityVo.getComdPrice() != null) {
                commodity.setComdPrice(Double.parseDouble(commodityVo.getComdPrice()));
            }
            if (commodityVo.getComdLastPrice() != null) {
                commodity.setComdLastPrice(Double.parseDouble(commodityVo.getComdLastPrice()));
            }
            if (commodityVo.getKindId() != null) {
                commodity.setKindId(Integer.valueOf(commodityVo.getKindId()));
            }

            /*UserElement currentUser = getCurrentUser();
            commodity.setUserId(currentUser.getUserId());*/

            commodity.setUserId(10);
            List<MultipartFile> files = ((MultipartHttpServletRequest) request)
                    .getFiles("file");
            String upload = uploadService.upload(commodity, files);
            if (upload == "upload_succ") {
                resp.setMessage("内容发布成功");
            } else {
                throw new ByleException("内容发布失败");
            }
        } catch (ByleException e) {
            resp.setCode(e.getStatusCode());
            resp.setMessage(e.getMessage());
        } catch (Exception e) {
            resp.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            resp.setMessage("内部错误");
        }
        return resp;
    }


    /**
     * 分类查询所有商品
     *
     * @param school
     * @return
     */
    @RequestMapping(value = "/getCommodities", method = RequestMethod.POST)
    @ApiOperation(value = "查询所有商品", notes = "根据学校ID查询用户ID然后再从commodity表中查询用户售出的二手物品,", httpMethod = "POST")
    @ApiImplicitParam(value = "schoolId")
    public ApiResult<List<CommodityWithUser>> getCommoditiesBySchool(@RequestBody School school) {
        ApiResult<List<CommodityWithUser>> result = new ApiResult<>();
        Integer schoolId = school.getSchoolId();
        try {
            if ((schoolId == null)) {
                throw new ByleException("schoolId不能为空");
            }
            List<CommodityWithUser> commodities = showCommodityService.getCommoditiesBySchool(schoolId);
            result.setData(commodities);
        } catch (ByleException e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage(e.getMessage());
        } catch (Exception e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage("服务器内部发生错误");
        }
        return result;
    }

    @RequestMapping(value = "/getCommodityiesBykind", method = RequestMethod.POST)
    @ApiOperation(value = "根据分类查询商品", notes = "安卓端传kindId", httpMethod = "POST")
    @ApiImplicitParam(value = "kindId", name = "kind", dataType = "Kind")
    public ApiResult getCommodityiesByKind(@RequestBody Kind kind) {
        ApiResult<List<CommodityWithUser>> result = new ApiResult();
        Integer kindId = kind.getKindId();
        try {
            if ((kindId == null)) {
                throw new ByleException("kindId不能为空");
            }
            List<CommodityWithUser> commodities = showCommodityService.getCommoditiesByKind(kindId);
            result.setData(commodities);
        } catch (ByleException e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage("kindId不能为空");
        } catch (Exception e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage("服务器内部发生错误");
        }
        return result;
    }

    @RequestMapping(value = "/getCommoditiesThroughSearch", method = RequestMethod.POST)
    @ApiOperation(value = "搜索商品", notes = "根据用户输入关键字进行商品搜索", httpMethod = "POST")
    public ApiResult<List<CommodityWithUser>> getCommoditiesThroughSearch(@RequestBody CommodityWithUser commodityWithUser) {
        ApiResult<List<CommodityWithUser>> result = new ApiResult<>();
        String comdTitle = commodityWithUser.getComdTitle();
        try {
            List<CommodityWithUser> commoditiesThroughSearch = showCommodityService.getCommoditiesThroughSearch(comdTitle);
            result.setData(commoditiesThroughSearch);
        } catch (Exception e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage("服务器内部发生错误");
        }
        return result;
    }

    @RequestMapping(value = "/getDecimalCommodities/{pageNum}", method = RequestMethod.POST)
    @ApiOperation(value = "搜索十条商品信息", notes = "传入的pageNum从1开始(表示首页)", httpMethod = "POST")
    public ApiResult<List<CommodityWithUser>> getDecimalCommodities(@PathVariable("pageNum") Integer pageNum) {
        ApiResult<List<CommodityWithUser>> result = new ApiResult<>();
        try {
            if ((pageNum.equals(0)) || (pageNum == null)) {
                throw new ByleException("pageNum不能为空或为零");
            }
            List<CommodityWithUser> decimalCommodities = showCommodityService.showDecimalCommodities(pageNum);
            result.setData(decimalCommodities);
        } catch (ByleException e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage(e.getMessage());
        } catch (Exception e) {
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage("服务器内部发生错误");
        }
        return result;
    }
}
