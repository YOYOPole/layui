package com.example.layui.service.impl;


import com.example.layui.cofig_utils.pagehelper.PageRequest;
import com.example.layui.entity.Product;
import com.example.layui.mapper.ProductCategoryMapper;
import com.example.layui.mapper.ProductMapper;
import com.example.layui.service.IProductService;
import com.example.layui.web.vo.DataVo;
import com.example.layui.web.vo.ProductVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Override
    public DataVo<ProductVo> find() {

        DataVo<ProductVo> dataVo = new DataVo<>();

        List<ProductVo> productVoList = new ArrayList<>();

        dataVo.setCode(0);
        dataVo.setMsg("");
        dataVo.setCount(productMapper.getCount());

        List<Product> products = productMapper.findAllProduct();//数据库查询出来的

        for (Product product : products) {
            ProductVo productVo = new ProductVo();

//            productVo.setId(product.getId()); //太麻烦了
            BeanUtils.copyProperties(product, productVo);//了解一下匹配规则，根据类型 还是名字
            //由于product一级、二级、只是Id，我们要的是 查到id对应的名字
            productVo.setCategorylevelone(productCategoryMapper.findNameById(product.getCategoryleveloneId()));
            productVo.setCategoryleveltwo(productCategoryMapper.findNameById(product.getCategoryleveltwoId()));
            productVo.setCategorylevelthree(productCategoryMapper.findNameById(product.getCategorylevelthreeId()));

            productVoList.add(productVo);
        }
        dataVo.setData(productVoList);

        return dataVo;
    }

    @Override
    public DataVo<ProductVo> find2(PageRequest pageRequest) {

        Page<Product> pages = PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());

        List<Product> products = productMapper.findAllProduct();//数据库查询出来的

        DataVo<ProductVo> dataVo = new DataVo<>();
        dataVo.setCode(0);
        dataVo.setMsg("");
//        dataVo.setCount(productMapper.getCount());
        dataVo.setCount((int) pages.getTotal());

        List<ProductVo> productVoList = new ArrayList<>();
        for (Product product : products) {
            ProductVo productVo = new ProductVo();

            //productVo.setId(product.getId()); //太麻烦了
            BeanUtils.copyProperties(product, productVo);//了解一下匹配规则，根据类型 还是名字
            //由于product一级、二级、只是Id，我们要的是 查到id对应的名字
            productVo.setCategorylevelone(productCategoryMapper.findNameById(product.getCategoryleveloneId()));
            productVo.setCategoryleveltwo(productCategoryMapper.findNameById(product.getCategoryleveltwoId()));
            productVo.setCategorylevelthree(productCategoryMapper.findNameById(product.getCategorylevelthreeId()));

            productVoList.add(productVo);
        }
        dataVo.setData(productVoList);

        return dataVo;
    }
}
