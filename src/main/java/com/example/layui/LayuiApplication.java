package com.example.layui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class LayuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuiApplication.class, args);
    }

}
