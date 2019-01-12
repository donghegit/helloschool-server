package com.grapep.byle.school.controller;

import com.grapep.byle.common.constants.Constants;
import com.grapep.byle.common.resp.ApiResult;
import com.grapep.byle.common.rest.BaseController;
import com.grapep.byle.school.entity.School;
import com.grapep.byle.school.service.SchoolService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RequestMapping("school")
@RestController
public class SchoolController extends BaseController {

    @Autowired
    @Qualifier("schoolServiceImpl")
    SchoolService schoolService;

    /**
     *
     * @describe 获取所有学校
     * @param:
     * @return
     * @author donghe
     * @date 2017/12/4 16:48
     */
    @RequestMapping(value = "/getSchool",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有学校",notes = "参数为空",httpMethod = "GET")
    public ApiResult<List<School>> getAllSchool(){
        ApiResult<List<School>> result = new ApiResult<>();
        try{
            List<School> schools = schoolService.getAllSchool();
            result.setData(schools);

        }catch (Exception e){
            result.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
            result.setMessage("服务器内部发生错误");
        }
        return result;
    }


}
