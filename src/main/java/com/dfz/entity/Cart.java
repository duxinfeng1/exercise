package com.dfz.entity;

public class Cart {
    private Integer id;

    private String gName;

    private Integer gPrice;

    private Integer gNum;

    private String sSize;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public String getsSize() {
        return sSize;
    }

    public void setsSize(String sSize) {
        this.sSize = sSize == null ? null : sSize.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}