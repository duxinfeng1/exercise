package com.dfz.entity;

import java.util.Date;

public class UserDetail {
    private Integer dId;

    private Integer uId;

    private String dName;

    private String sex;

    private String dImage;

    private Double dHeight;

    private Double dWeight;

    private String dInfo;

    private String dUserid;

    private Date dRegister;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getdImage() {
        return dImage;
    }

    public void setdImage(String dImage) {
        this.dImage = dImage == null ? null : dImage.trim();
    }

    public Double getdHeight() {
        return dHeight;
    }

    public void setdHeight(Double dHeight) {
        this.dHeight = dHeight;
    }

    public Double getdWeight() {
        return dWeight;
    }

    public void setdWeight(Double dWeight) {
        this.dWeight = dWeight;
    }

    public String getdInfo() {
        return dInfo;
    }

    public void setdInfo(String dInfo) {
        this.dInfo = dInfo == null ? null : dInfo.trim();
    }

    public String getdUserid() {
        return dUserid;
    }

    public void setdUserid(String dUserid) {
        this.dUserid = dUserid == null ? null : dUserid.trim();
    }

    public Date getdRegister() {
        return dRegister;
    }

    public void setdRegister(Date dRegister) {
        this.dRegister = dRegister;
    }
}