package com.dfz.entity;

public class User {
    private Integer uId;

    private String uPhone;

    private String uEmail;

    private String uPassword;

    private Integer uFlag;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuFlag() {
        return uFlag;
    }

    public void setuFlag(Integer uFlag) {
        this.uFlag = uFlag;
    }
}
