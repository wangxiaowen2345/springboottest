package com.qust.model;

public class tkb_Picrelation {
    private Integer id;

    private Integer pid;

    private String relationname;

    private Integer relationid;

    private Integer del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRelationname() {
        return relationname;
    }

    public void setRelationname(String relationname) {
        this.relationname = relationname == null ? null : relationname.trim();
    }

    public Integer getRelationid() {
        return relationid;
    }

    public void setRelationid(Integer relationid) {
        this.relationid = relationid;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}