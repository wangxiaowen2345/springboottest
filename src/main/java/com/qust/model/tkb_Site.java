package com.qust.model;

import java.util.Date;

public class tkb_Site {
    private Integer id;

    private String lng;

    private String lat;

    private Date time;

    private Date latertime;

    private Integer del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
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

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}