package com.skc.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeController {
    @RequestMapping("/test")
    public String thymeleaf(Model model){
        List<String> listString = new ArrayList<String>();
        listString.add("123");listString.add("456");listString.add("789");listString.add("abc");listString.add("def");
        model.addAttribute("listString",listString);
        String str = "xyz";
        model.addAttribute("xyz",null);
        //如果传递过来的是Map集合呢？
        Map<String,String> map  = new HashMap<>();
        map.put("1","a");        map.put("2","b");        map.put("3","c");
        map.put("4","d");        map.put("5","e");
        model.addAttribute("map",map);
        return "test";
    }
}
