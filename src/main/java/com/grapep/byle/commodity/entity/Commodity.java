package com.grapep.byle.commodity.entity;



import java.util.Date;

public class Commodity {
    private Integer commodyId;

    private Integer userId;

    private Integer kindId;

    private String comdName;

    private String comdTitle;

    private Double comdPrice;

    private Date comdReleaseTime;

    private Date comodOffShelfTime;

    private Date comdDeleteTime;

    private String comdState;

    private Double comdLastPrice;






    public Integer getCommodyId() {
        return commodyId;
    }

    public void setCommodyId(Integer commodyId) {
        this.commodyId = commodyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getComdName() {
        return comdName;
    }

    public void setComdName(String comdName) {
        this.comdName = comdName == null ? null : comdName.trim();
    }

    public String getComdTitle() {
        return comdTitle;
    }

    public void setComdTitle(String comdTitle) {
        this.comdTitle = comdTitle == null ? null : comdTitle.trim();
    }

    public Double getComdPrice() {
        return comdPrice;
    }

    public void setComdPrice(Double comdPrice) {
        this.comdPrice = comdPrice;
    }

    public Date getComdReleaseTime() {
        return comdReleaseTime;
    }

    public void setComdReleaseTime(Date comdReleaseTime) {
        this.comdReleaseTime = comdReleaseTime;
    }

    public Date getComodOffShelfTime() {
        return comodOffShelfTime;
    }

    public void setComodOffShelfTime(Date comodOffShelfTime) {
        this.comodOffShelfTime = comodOffShelfTime;
    }

    public Date getComdDeleteTime() {
        return comdDeleteTime;
    }

    public void setComdDeleteTime(Date comdDeleteTime) {
        this.comdDeleteTime = comdDeleteTime;
    }

    public String getComdState() {
        return comdState;
    }

    public void setComdState(String comdState) {
        this.comdState = comdState == null ? null : comdState.trim();
    }

    public Double getComdLastPrice() {
        return comdLastPrice;
    }

    public void setComdLastPrice(Double comdLastPrice) {
        this.comdLastPrice = comdLastPrice;
    }
}