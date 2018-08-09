package com.qust.model;

import java.util.Date;

public class tkb_Prorelation {
    private Integer id;

    private Integer proid;

    private Integer userid;

    private Date time;

    private Integer del;

    private Date latertime;

    private Integer isshow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Date getLatertime() {
        return latertime;
    }

    public void setLatertime(Date latertime) {
        this.latertime = latertime;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }
}