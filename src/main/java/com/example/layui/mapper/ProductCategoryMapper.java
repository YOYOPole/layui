package com.example.layui.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductCategoryMapper {

    //根据id找分类名字
    public String findNameById(Integer id);
}
