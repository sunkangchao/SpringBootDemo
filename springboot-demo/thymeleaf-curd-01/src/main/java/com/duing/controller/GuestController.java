package com.duing.controller;

import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;
    //设计一个方法，用于查询表格内容并且返回。

    @RequestMapping("/list")
    public String list(Model model) {
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList", guestList);
        return "list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "toAdd";
    }

    @RequestMapping("/add")
    public String add(Guest guest) {//这里是一个对象，会根据对象的属性名字去查找携带过来的参数，并且给对象注入值。
        guestService.add(guest);//执行完这一步，还是回到controller层。
        //因该是重定向，而不是转发。
        return "redirect:/guest/list";   //默认就是转发，没有错，源码你也写过了。
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);
        return "toUpdate";
    }

    @RequestMapping("/update")
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/delete")
    public String delete(String name) {
        guestService.delete(name);
        return "redirect:/guest/list";
    }


}
