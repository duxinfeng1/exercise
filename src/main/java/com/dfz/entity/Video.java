package com.dfz.entity;

public class Video {
    private Integer tvId;

    private String tvAdress;

    private String tvName;

    private Integer myId;

    public Integer getTvId() {
        return tvId;
    }

    public void setTvId(Integer tvId) {
        this.tvId = tvId;
    }

    public String getTvAdress() {
        return tvAdress;
    }

    public void setTvAdress(String tvAdress) {
        this.tvAdress = tvAdress == null ? null : tvAdress.trim();
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName == null ? null : tvName.trim();
    }

    public Integer getMyId() {
        return myId;
    }

    public void setMyId(Integer myId) {
        this.myId = myId;
    }
}