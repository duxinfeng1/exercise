package com.dfz.entity;

import java.util.Date;

public class Action {
    private Integer taId;

    private String taUrl;

    private String taPart;

    private Integer taTime;

    private Date taRest;

    private String taApparatus;

    public Integer getTaId() {
        return taId;
    }

    public void setTaId(Integer taId) {
        this.taId = taId;
    }

    public String getTaUrl() {
        return taUrl;
    }

    public void setTaUrl(String taUrl) {
        this.taUrl = taUrl == null ? null : taUrl.trim();
    }

    public String getTaPart() {
        return taPart;
    }

    public void setTaPart(String taPart) {
        this.taPart = taPart == null ? null : taPart.trim();
    }

    public Integer getTaTime() {
        return taTime;
    }

    public void setTaTime(Integer taTime) {
        this.taTime = taTime;
    }

    public Date getTaRest() {
        return taRest;
    }

    public void setTaRest(Date taRest) {
        this.taRest = taRest;
    }

    public String getTaApparatus() {
        return taApparatus;
    }

    public void setTaApparatus(String taApparatus) {
        this.taApparatus = taApparatus == null ? null : taApparatus.trim();
    }
}