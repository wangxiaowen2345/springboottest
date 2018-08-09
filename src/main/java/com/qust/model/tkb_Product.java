package com.qust.model;

import java.util.Date;

public class tkb_Product {
    private Integer id;

    private String proname;

    private String prorequire;

    private String protrait;

    private Date time;

    private Date altertime;

    private Integer del;

    private String prointro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProrequire() {
        return prorequire;
    }

    public void setProrequire(String prorequire) {
        this.prorequire = prorequire == null ? null : prorequire.trim();
    }

    public String getProtrait() {
        return protrait;
    }

    public void setProtrait(String protrait) {
        this.protrait = protrait == null ? null : protrait.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getAltertime() {
        return altertime;
    }

    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public String getProintro() {
        return prointro;
    }

    public void setProintro(String prointro) {
        this.prointro = prointro == null ? null : prointro.trim();
    }
}