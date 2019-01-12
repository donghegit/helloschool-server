package com.grapep.byle.kind.controller;

import com.grapep.byle.common.constants.Constants;
import com.grapep.byle.common.resp.ApiResult;
import com.grapep.byle.common.rest.BaseController;
import com.grapep.byle.kind.entity.Kind;
import com.grapep.byle.kind.service.KindService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Describe: TODO
 * @Author : donghe
 * @DateTime: 2017.11.28  18:22
 */

@Slf4j
@RestController
@RequestMapping("kind")
public class KindController extends BaseController{

    @Autowired
    private KindService kindService;

    /**
     *
     * @describe 获取全部分类
     * @param:
     * @return
     * @author donghe
     * @date 2017/11/28 21:07
     */
    @RequestMapping(value = "/getKinds",method = RequestMethod.GET)
    public ApiResult<List<Kind>> getKinds(){
        ApiResult<List<Kind>> result = new ApiResult<>();
        try{
            List<Kind> kinds = kindService.getAllKind();
            result.setData(kinds);
        }catch (Exception e){
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage("服务器内部发生错误");
        }
        return result;
    }

}
