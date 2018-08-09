package com.qust.model;

import java.util.Date;

public class tkb_Userrelation {
    private Integer id;

    private Integer userid;

    private Integer fid;

    private Integer del;

    private Date time;

    private Date latertime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getLatertime() {
        return latertime;
    }

    public void setLatertime(Date latertime) {
        this.latertime = latertime;
    }
}