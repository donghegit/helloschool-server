package com.grapep.byle.commodity.service;

import com.grapep.byle.commodity.entity.CommodityWithBLOBs;
import com.grapep.byle.commodity.entity.CommodityWithUser;
import com.grapep.byle.school.entity.School;

import java.util.List;
import java.util.Map;

/**
 * @Describe: TODO
 * @Author : donghe
 * @DateTime: 2017.12.04  17:18
 */
public interface ShowCommodityService {
    List<CommodityWithUser> getCommoditiesBySchool(Integer schoolId);

    List<CommodityWithUser> getCommoditiesByKind(Integer kindId);

    List<CommodityWithUser> getCommoditiesThroughSearch(String comdTitle);

    List<CommodityWithUser> showDecimalCommodities(Integer pageNum);
}
