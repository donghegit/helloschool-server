package com.grapep.byle.commodity.dao;

import com.grapep.byle.commodity.entity.Commodity;
import com.grapep.byle.commodity.entity.CommodityExample;
import com.grapep.byle.commodity.entity.CommodityWithBLOBs;
import java.util.List;

import com.grapep.byle.commodity.entity.CommodityWithUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CommodityMapper {
    int countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int deleteByPrimaryKey(Integer commodyId);

    int insert(CommodityWithBLOBs record);

    int insertSelective(CommodityWithBLOBs record);

    List<CommodityWithBLOBs> selectByExampleWithBLOBs(CommodityExample example);

    List<Commodity> selectByExample(CommodityExample example);

    CommodityWithBLOBs selectByPrimaryKey(Integer commodyId);

    int updateByExampleSelective(@Param("record") CommodityWithBLOBs record, @Param("example") CommodityExample example);

    int updateByExampleWithBLOBs(@Param("record") CommodityWithBLOBs record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByPrimaryKeySelective(CommodityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommodityWithBLOBs record);

    int updateByPrimaryKey(Commodity record);

    List<CommodityWithUser> selectCommoditiesBySchool(Integer schoolId);

    List<CommodityWithUser> selectCommoditiesByKind(Integer KindId);

    List<CommodityWithUser> selectCommoditiesThroughSearch(@Param("comdTitle")String comdTitle);

    List<CommodityWithUser> selectDecimalComodities();
}