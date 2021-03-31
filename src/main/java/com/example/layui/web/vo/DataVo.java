package com.example.layui.web.vo;

import com.example.layui.entity.Product;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DataVo<T> implements Serializable {
    /**
     * 根据 JSON调整数据格式
     */
    private Integer code;
    private String msg;
    private Integer count;
    private List<T> data;
}
