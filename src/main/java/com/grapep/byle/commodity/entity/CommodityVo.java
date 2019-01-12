package com.grapep.byle.commodity.entity;

import lombok.Data;

/**
 * @Describe: 增加Vo，映射请求。解决po映射请求不匹配问题
 * @Author : donghe
 * @DateTime: 2017.12.04  14:51
 */
@Data
public class CommodityVo {
    private String kindId;
    private String comdTitle;
    private String comdPrice;
    private String comdLastPrice;
    private String comdContent;

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId;
    }

    public String getComdTitle() {
        return comdTitle;
    }

    public void setComdTitle(String comdTitle) {
        this.comdTitle = comdTitle;
    }

    public String getComdPrice() {
        return comdPrice;
    }

    public void setComdPrice(String comdPrice) {
        this.comdPrice = comdPrice;
    }

    public String getComdLastPrice() {
        return comdLastPrice;
    }

    public void setComdLastPrice(String comdLastPrice) {
        this.comdLastPrice = comdLastPrice;
    }

    public String getComdContent() {
        return comdContent;
    }

    public void setComdContent(String comdContent) {
        this.comdContent = comdContent;
    }
}
