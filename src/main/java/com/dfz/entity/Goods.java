package com.dfz.entity;

public class Goods {
    private Integer gId;

    private String gName;

    private Integer gPrice;

    private String gCommon;

    private String gSaw;

    private Integer bId;

    private Integer flag;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Integer getgPrice() {
        return gPrice;
    }

    public void setgPrice(Integer gPrice) {
        this.gPrice = gPrice;
    }

    public String getgCommon() {
        return gCommon;
    }

    public void setgCommon(String gCommon) {
        this.gCommon = gCommon == null ? null : gCommon.trim();
    }

    public String getgSaw() {
        return gSaw;
    }

    public void setgSaw(String gSaw) {
        this.gSaw = gSaw == null ? null : gSaw.trim();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}