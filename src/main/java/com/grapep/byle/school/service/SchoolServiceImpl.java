package com.grapep.byle.school.service;

import com.grapep.byle.school.dao.SchoolMapper;
import com.grapep.byle.school.entity.School;
import com.grapep.byle.user.dao.UserMapper;
import com.grapep.byle.user.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Describe: TODO
 * @Author : donghe
 * @DateTime: 2017.12.04  16:34
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public List<School> getAllSchool() {
        return schoolMapper.selectSchool();
    }


}
