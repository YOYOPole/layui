package com.example.layui.web;

import com.example.layui.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    // Restful 风格 正确写法示例 【POST具有添加的意思】
    @RequestMapping(value = "/hello2/{id}",method = {RequestMethod.POST})
    public String hello2(@PathVariable("id") Integer id){
        System.out.println(id);
        return "hello";
    }
}
