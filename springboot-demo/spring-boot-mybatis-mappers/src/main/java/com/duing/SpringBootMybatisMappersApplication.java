package com.duing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.duing.mapper")
@SpringBootApplication
public class SpringBootMybatisMappersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisMappersApplication.class, args);
    }

}
