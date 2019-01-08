package com.dfz.entity;

import java.util.Date;

public class Release {
    private Integer trId;

    private String trInfo;

    private Integer thId;

    private Integer dId;

    private Integer trPraise;

    private Date trReporttime;

    private Integer trFlag;

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }

    public String getTrInfo() {
        return trInfo;
    }

    public void setTrInfo(String trInfo) {
        this.trInfo = trInfo == null ? null : trInfo.trim();
    }

    public Integer getThId() {
        return thId;
    }

    public void setThId(Integer thId) {
        this.thId = thId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getTrPraise() {
        return trPraise;
    }

    public void setTrPraise(Integer trPraise) {
        this.trPraise = trPraise;
    }

    public Date getTrReporttime() {
        return trReporttime;
    }

    public void setTrReporttime(Date trReporttime) {
        this.trReporttime = trReporttime;
    }

    public Integer getTrFlag() {
        return trFlag;
    }

    public void setTrFlag(Integer trFlag) {
        this.trFlag = trFlag;
    }
}