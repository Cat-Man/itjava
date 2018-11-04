package com.example.firstdemo.controller;

import com.example.firstdemo.domain.MallProduct;
import com.example.firstdemo.service.MallProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MallProductController {
    private final MallProductService mallProductService;
    @Autowired
    public MallProductController(MallProductService mallProductService){
        this.mallProductService =mallProductService;
    }
    @RequestMapping("/mall/findAll")
    public List<MallProduct> findAll(){
        return mallProductService.selectAll();
    }
}