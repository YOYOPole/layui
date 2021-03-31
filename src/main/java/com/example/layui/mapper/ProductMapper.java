package com.example.layui.mapper;

import com.example.layui.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    //查询所有产品信息
    public List<Product> findAllProduct();

    //查询产品个数 根据id来统计
    public Integer getCount();

}
