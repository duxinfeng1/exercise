package com.dfz.entity;

public class Address {
    private Integer id;

    private String name;

    private String phone;

    private String aAdress;

    private Integer dId;

    public String getaDetail() {
        return aDetail;
    }

    public void setaDetail(String aDetail) {
        this.aDetail = aDetail;
    }

    private String aDetail;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getaAdress() {
        return aAdress;
    }

    public void setaAdress(String aAdress) {
        this.aAdress = aAdress == null ? null : aAdress.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}