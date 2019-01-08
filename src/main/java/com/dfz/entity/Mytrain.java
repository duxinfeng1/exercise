package com.dfz.entity;

import java.util.Date;

public class Mytrain {
    private Integer mtId;

    private String mtName;

    private String mtInfo;

    private Integer mtLooptime;

    private Date mtTimes;

    private Integer mtFlag;

    private Integer mtFree;

    private String mtImgpath;

    public Integer getMtId() {
        return mtId;
    }

    public void setMtId(Integer mtId) {
        this.mtId = mtId;
    }

    public String getMtName() {
        return mtName;
    }

    public void setMtName(String mtName) {
        this.mtName = mtName == null ? null : mtName.trim();
    }

    public String getMtInfo() {
        return mtInfo;
    }

    public void setMtInfo(String mtInfo) {
        this.mtInfo = mtInfo == null ? null : mtInfo.trim();
    }

    public Integer getMtLooptime() {
        return mtLooptime;
    }

    public void setMtLooptime(Integer mtLooptime) {
        this.mtLooptime = mtLooptime;
    }

    public Date getMtTimes() {
        return mtTimes;
    }

    public void setMtTimes(Date mtTimes) {
        this.mtTimes = mtTimes;
    }

    public Integer getMtFlag() {
        return mtFlag;
    }

    public void setMtFlag(Integer mtFlag) {
        this.mtFlag = mtFlag;
    }

    public Integer getMtFree() {
        return mtFree;
    }

    public void setMtFree(Integer mtFree) {
        this.mtFree = mtFree;
    }

    public String getMtImgpath() {
        return mtImgpath;
    }

    public void setMtImgpath(String mtImgpath) {
        this.mtImgpath = mtImgpath == null ? null : mtImgpath.trim();
    }
}