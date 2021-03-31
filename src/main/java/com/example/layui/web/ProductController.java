package com.example.layui.web;

import com.example.layui.cofig_utils.pagehelper.PageRequest;
import com.example.layui.service.IProductService;
import com.example.layui.web.vo.DataVo;
import com.example.layui.web.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @Autowired
    IProductService productService;


    @RequestMapping("/list")
    @ResponseBody
    public DataVo<ProductVo> test() {

        DataVo<ProductVo> productVoDataVo = productService.find();
        return productVoDataVo;
    }

    @RequestMapping("/limit")
    @ResponseBody
    public DataVo<ProductVo> test1(PageRequest pageRequest) {

        DataVo<ProductVo> productVoDataVo = productService.find2(pageRequest);
        return productVoDataVo;
    }

}
