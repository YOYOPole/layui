package com.example.layui.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class User implements Serializable {
    private String name;
    private Integer age;

    List<User> list;

    Map<String,User> map;
    
    //setter/getter/toString省略
}
