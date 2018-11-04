package com.example.firstdemo.service;

import com.example.firstdemo.dao.MallProductMapper;
import com.example.firstdemo.domain.MallProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MallProductService {
    @Autowired
    private MallProductMapper mallProductMapper;
    public List<MallProduct> selectAll(){
        List<MallProduct> mallProducts = mallProductMapper.selectAll();
        return mallProducts;
    }
}
