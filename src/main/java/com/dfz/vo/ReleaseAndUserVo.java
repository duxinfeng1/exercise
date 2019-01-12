package com.dfz.vo;

import com.dfz.entity.Images;

import java.util.Date;
import java.util.List;

public class ReleaseAndUserVo {

    private Integer dId;
    private String dName;
    private String dImage;
    private Integer trId;
    private Integer trPraise;
    private Date trReporttime;
    private List<Images> imagesList;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdImage() {
        return dImage;
    }

    public void setdImage(String dImage) {
        this.dImage = dImage;
    }

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
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

    public List<Images> getImagesList() {
        return imagesList;
    }

    public void setImagesList(List<Images> imagesList) {
        this.imagesList = imagesList;
    }
}
