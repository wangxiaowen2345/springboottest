package com.qust.model;

import java.util.Date;

public class tkb_Pic {
    private Integer id;

    private String suffix;

    private String plist;

    private Date tiam;

    private Date latertime;

    private Integer del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public String getPlist() {
        return plist;
    }

    public void setPlist(String plist) {
        this.plist = plist == null ? null : plist.trim();
    }

    public Date getTiam() {
        return tiam;
    }

    public void setTiam(Date tiam) {
        this.tiam = tiam;
    }

    public Date getLatertime() {
        return latertime;
    }

    public void setLatertime(Date latertime) {
        this.latertime = latertime;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}