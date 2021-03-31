package com.example.layui.mapper;

import com.example.layui.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest()
@SuppressWarnings("All")
class ProductMapperTest {

    @Autowired
    ProductMapper productMapper;

    @Test
    void findAllProduct() {
        List<Product> allProduct = productMapper.findAllProduct();
        allProduct.forEach(System.out::println);
    }

    @Test
    void getCount() {
        Integer count = productMapper.getCount();
        System.out.println(count);
    }
}