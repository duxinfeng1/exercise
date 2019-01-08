package com.dfz.entity;

public class Brand {
    private Integer bId;

    private String brandname;

    private Integer falg;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public Integer getFalg() {
        return falg;
    }

    public void setFalg(Integer falg) {
        this.falg = falg;
    }
}