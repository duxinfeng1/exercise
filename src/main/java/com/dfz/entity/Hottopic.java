package com.dfz.entity;

public class Hottopic {
    private Integer thId;

    private String thTitle;

    private String thInfo;

    private String thImage;

    public Integer getThId() {
        return thId;
    }

    public void setThId(Integer thId) {
        this.thId = thId;
    }

    public String getThTitle() {
        return thTitle;
    }

    public void setThTitle(String thTitle) {
        this.thTitle = thTitle == null ? null : thTitle.trim();
    }

    public String getThInfo() {
        return thInfo;
    }

    public void setThInfo(String thInfo) {
        this.thInfo = thInfo == null ? null : thInfo.trim();
    }

    public String getThImage() {
        return thImage;
    }

    public void setThImage(String thImage) {
        this.thImage = thImage == null ? null : thImage.trim();
    }
}