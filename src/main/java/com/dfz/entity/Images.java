package com.dfz.entity;

public class Images {
    private Integer tiId;

    private String tiUrl;

    private Integer trId;

    public Integer getTiId() {
        return tiId;
    }

    public void setTiId(Integer tiId) {
        this.tiId = tiId;
    }

    public String getTiUrl() {
        return tiUrl;
    }

    public void setTiUrl(String tiUrl) {
        this.tiUrl = tiUrl == null ? null : tiUrl.trim();
    }

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }
}