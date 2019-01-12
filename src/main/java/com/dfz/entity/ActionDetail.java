package com.dfz.entity;

public class ActionDetail {
    private Integer id;

    private String tActionname;

    private Integer tActionnum;

    private Integer tRest;

    private String tElse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettActionname() {
        return tActionname;
    }

    public void settActionname(String tActionname) {
        this.tActionname = tActionname == null ? null : tActionname.trim();
    }

    public Integer gettActionnum() {
        return tActionnum;
    }

    public void settActionnum(Integer tActionnum) {
        this.tActionnum = tActionnum;
    }

    public Integer gettRest() {
        return tRest;
    }

    public void settRest(Integer tRest) {
        this.tRest = tRest;
    }

    public String gettElse() {
        return tElse;
    }

    public void settElse(String tElse) {
        this.tElse = tElse == null ? null : tElse.trim();
    }
}