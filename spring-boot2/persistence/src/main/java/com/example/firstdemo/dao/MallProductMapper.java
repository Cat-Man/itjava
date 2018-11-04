package com.example.firstdemo.dao;

import com.example.firstdemo.domain.MallProduct;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MallProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallProduct record);

    int insertSelective(MallProduct record);

    MallProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MallProduct record);

    int updateByPrimaryKey(MallProduct record);

    List<MallProduct> selectAll();
}