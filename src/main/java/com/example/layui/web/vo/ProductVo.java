package com.example.layui.web.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductVo implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String categorylevelone;
    private String categoryleveltwo;
    private String categorylevelthree;
    private String fileName;
}
