package com.grapep.byle.commodity.entity;

public class CommodityWithBLOBs extends Commodity {
    private String comdContent;

    private String comdPicture;

    public String getComdContent() {
        return comdContent;
    }

    public void setComdContent(String comdContent) {
        this.comdContent = comdContent == null ? null : comdContent.trim();
    }

    public String getComdPicture() {
        return comdPicture;
    }

    public void setComdPicture(String comdPicture) {
        this.comdPicture = comdPicture == null ? null : comdPicture.trim();
    }
}