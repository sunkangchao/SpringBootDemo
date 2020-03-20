package com.skc.springbootdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController的功能相当于@Controller+@ResponseBody。
 *
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
            return "Hello world!孙康超hello111333";
    }
}
