package com.example.firstdemo.domain;

import java.util.Date;

public class MallProduct {
    private Integer id;

    private String name;

    private String description;

    private Float orignalprice;

    private Float promoteprice;

    private Integer stock;

    private Integer cid;

    private Date createdate;

    public MallProduct(Integer id, String name, String description, Float orignalprice, Float promoteprice, Integer stock, Integer cid, Date createdate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.orignalprice = orignalprice;
        this.promoteprice = promoteprice;
        this.stock = stock;
        this.cid = cid;
        this.createdate = createdate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Float getOrignalprice() {
        return orignalprice;
    }

    public Float getPromoteprice() {
        return promoteprice;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getCid() {
        return cid;
    }

    public Date getCreatedate() {
        return createdate;
    }
}