package com.example.layui.service;


import com.example.layui.cofig_utils.pagehelper.PageRequest;
import com.example.layui.web.vo.DataVo;
import com.example.layui.web.vo.ProductVo;
import org.springframework.stereotype.Service;


public interface IProductService {

    //确定返回类型，就是JSON数据类型
    public DataVo<ProductVo> find();

    //确定返回类型，就是JSON数据类型
    public DataVo<ProductVo> find2(PageRequest pageRequest);
}
