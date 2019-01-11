package com.dfz.entity;

public class Cart {
    private Integer id;

    private Integer gId;

    private String gName;

    private Float gPrice;

    private Integer gNum;

    private String sSize;

    private String gImg;

    private Integer uId;

    private Integer flag;


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getgImg() {
        return gImg;
    }

    public void setgImg(String gImg) {
        this.gImg = gImg;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

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

    public Float getgPrice() {
        return gPrice;
    }

    public void setgPrice(Float gPrice) {
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