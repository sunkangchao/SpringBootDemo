package com.duing.controller;

import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping  //至少需要声明以下是get请求，也就是哪怕不写请求，requestMapping这个注解也不可省略，因为需要默认携带一个method。
    public List<Guest> find(){
        return guestService.find();
    }
}
