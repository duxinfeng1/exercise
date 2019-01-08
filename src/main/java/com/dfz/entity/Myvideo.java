package com.dfz.entity;

public class Myvideo {
    private Integer myId;

    private String myProject;

    private String myInfo;

    private Integer myDifficulty;

    private String myCycle;

    private Integer myFlag;

    public Integer getMyId() {
        return myId;
    }

    public void setMyId(Integer myId) {
        this.myId = myId;
    }

    public String getMyProject() {
        return myProject;
    }

    public void setMyProject(String myProject) {
        this.myProject = myProject == null ? null : myProject.trim();
    }

    public String getMyInfo() {
        return myInfo;
    }

    public void setMyInfo(String myInfo) {
        this.myInfo = myInfo == null ? null : myInfo.trim();
    }

    public Integer getMyDifficulty() {
        return myDifficulty;
    }

    public void setMyDifficulty(Integer myDifficulty) {
        this.myDifficulty = myDifficulty;
    }

    public String getMyCycle() {
        return myCycle;
    }

    public void setMyCycle(String myCycle) {
        this.myCycle = myCycle == null ? null : myCycle.trim();
    }

    public Integer getMyFlag() {
        return myFlag;
    }

    public void setMyFlag(Integer myFlag) {
        this.myFlag = myFlag;
    }
}