package com.dfz.entity;

import java.util.Date;

public class Reply {
    private Integer reId;

    private Integer reFlag;

    private Integer grId;

    private Integer dId;

    private Integer subordinatetid;

    private Integer parentid;

    private String reInfo;

    private Date reTime;

    private Integer reUserId;

    private Integer rePraise;

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getReFlag() {
        return reFlag;
    }

    public void setReFlag(Integer reFlag) {
        this.reFlag = reFlag;
    }

    public Integer getGrId() {
        return grId;
    }

    public void setGrId(Integer grId) {
        this.grId = grId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getSubordinatetid() {
        return subordinatetid;
    }

    public void setSubordinatetid(Integer subordinatetid) {
        this.subordinatetid = subordinatetid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getReInfo() {
        return reInfo;
    }

    public void setReInfo(String reInfo) {
        this.reInfo = reInfo == null ? null : reInfo.trim();
    }

    public Date getReTime() {
        return reTime;
    }

    public void setReTime(Date reTime) {
        this.reTime = reTime;
    }

    public Integer getReUserId() {
        return reUserId;
    }

    public void setReUserId(Integer reUserId) {
        this.reUserId = reUserId;
    }

    public Integer getRePraise() {
        return rePraise;
    }

    public void setRePraise(Integer rePraise) {
        this.rePraise = rePraise;
    }
}