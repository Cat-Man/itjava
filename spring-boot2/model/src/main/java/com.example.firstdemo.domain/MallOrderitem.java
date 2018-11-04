package com.example.firstdemo.domain;

import java.util.Date;

public class MallOrderitem {
    private Integer id;

    private String orderCode;

    private Integer uid;

    private String orderQuantity;

    private Date ordertime;

    public MallOrderitem(Integer id, String orderCode, Integer uid, String orderQuantity, Date ordertime) {
        this.id = id;
        this.orderCode = orderCode;
        this.uid = uid;
        this.orderQuantity = orderQuantity;
        this.ordertime = ordertime;
    }

    public Integer getId() {
        return id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public Integer getUid() {
        return uid;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public Date getOrdertime() {
        return ordertime;
    }
}