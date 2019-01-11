package com.dfz.vo;

import java.util.Date;
import java.util.List;

public class ReplyVo {
    private Integer reId;
    private Integer dId;
    private String dName;
    private String reInfo;
    private Date reTime;
    private Integer rePraise;
    private List<ReReplyVo> reReplyVos;

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public List<ReReplyVo> getReReplyVos() {
        return reReplyVos;
    }

    public void setReReplyVos(List<ReReplyVo> reReplyVos) {
        this.reReplyVos = reReplyVos;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getReInfo() {
        return reInfo;
    }

    public void setReInfo(String reInfo) {
        this.reInfo = reInfo;
    }

    public Date getReTime() {
        return reTime;
    }

    public void setReTime(Date reTime) {
        this.reTime = reTime;
    }

    public Integer getRePraise() {
        return rePraise;
    }

    public void setRePraise(Integer rePraise) {
        this.rePraise = rePraise;
    }
}
