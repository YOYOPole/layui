package com.example.layui.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ProductCategoryMapperTest {

    @Autowired
    ProductCategoryMapper mapper;

    @Test
    void findNameById() {
        String nameById = mapper.findNameById(548);
        System.out.println(nameById);
    }
}