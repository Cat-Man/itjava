package com.example.firstdemo.domain;

public class MallPd {
    private Integer id;

    private Integer pid;

    private Integer oid;

    public MallPd(Integer id, Integer pid, Integer oid) {
        this.id = id;
        this.pid = pid;
        this.oid = oid;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPid() {
        return pid;
    }

    public Integer getOid() {
        return oid;
    }
}