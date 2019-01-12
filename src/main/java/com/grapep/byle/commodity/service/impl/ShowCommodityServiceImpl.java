package com.grapep.byle.commodity.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grapep.byle.commodity.dao.CommodityMapper;
import com.grapep.byle.commodity.entity.CommodityWithUser;
import com.grapep.byle.commodity.service.ShowCommodityService;
import com.grapep.byle.common.exception.ByleException;
import com.grapep.byle.kind.entity.KindExample;
import com.grapep.byle.user.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Describe: TODO
 * @Author : donghe
 * @DateTime: 2017.12.04  17:36
 */
@Service
@Slf4j
public class ShowCommodityServiceImpl implements ShowCommodityService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<CommodityWithUser> getCommoditiesBySchool(Integer schoolId) {
        List<CommodityWithUser> commodityWithUsers = commodityMapper.selectCommoditiesBySchool(schoolId);
        return commodityWithUsers;
    }

    /**
     * 根据kindId查询所有commodities
     * @param kindId
     * @return
     */
    @Override
    public List<CommodityWithUser> getCommoditiesByKind(Integer kindId) {
        List<CommodityWithUser> commodityWithUsers = commodityMapper.selectCommoditiesByKind(kindId);
        return commodityWithUsers;
    }

    @Override
    public List<CommodityWithUser> getCommoditiesThroughSearch(String comdTitle) {
        List<CommodityWithUser> commodities = commodityMapper.selectCommoditiesThroughSearch(comdTitle);
        return commodities;
    }

    @Override
    public List<CommodityWithUser> showDecimalCommodities(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        List<CommodityWithUser> commodityWithUsers = commodityMapper.selectDecimalComodities();
        PageInfo<CommodityWithUser> pageInfo = new PageInfo<>(commodityWithUsers);
        return commodityWithUsers;
    }

}
