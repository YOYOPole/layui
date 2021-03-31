package com.example.layui.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductCategory implements Serializable {
    //目前业务只需要用到这两个
    private Integer id;
    private String name;

    //还有很多没写进来,为什么不写进来，思考

}
