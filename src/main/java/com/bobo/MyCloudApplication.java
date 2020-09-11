package com.bobo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan
public class MyCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudApplication.class, args);
    }

}
