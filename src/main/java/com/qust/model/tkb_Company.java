package com.qust.model;

import java.util.Date;

public class tkb_Company {
    private Integer id;

    private String conname;

    private String addr;

    private Integer site;

    private Integer userid;

    private Integer del;

    private Date altertime;

    private Date time;

    private String conintro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConname() {
        return conname;
    }

    public void setConname(String conname) {
        this.conname = conname == null ? null : conname.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getSite() {
        return site;
    }

    public void setSite(Integer site) {
        this.site = site;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Date getAltertime() {
        return altertime;
    }

    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getConintro() {
        return conintro;
    }

    public void setConintro(String conintro) {
        this.conintro = conintro == null ? null : conintro.trim();
    }
}