package com.example.layui.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Product implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private Integer categoryleveloneId;
    private Integer categoryleveltwoId;
    private Integer categorylevelthreeId;
    private String fileName;
    int anInt = 1;

}
