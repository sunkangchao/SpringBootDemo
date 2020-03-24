package com.skc.springbootdemo;

import com.skc.springbootdemo.config.SkcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(SkcConfig.class)
@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
    //这个方式，连入口都给你配置好了。真的是方便的不得了。

}
