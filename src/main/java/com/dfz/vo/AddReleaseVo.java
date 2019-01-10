package com.dfz.vo;

import com.dfz.entity.Hottopic;

public class AddReleaseVo {

    private Hottopic hottopic;

    private Integer releaseNumber;

    public Hottopic getHottopic() {
        return hottopic;
    }

    public void setHottopic(Hottopic hottopic) {
        this.hottopic = hottopic;
    }

    public Integer getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(Integer releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}
