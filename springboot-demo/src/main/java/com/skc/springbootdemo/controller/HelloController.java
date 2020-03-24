package com.skc.springbootdemo.controller;


import com.skc.springbootdemo.bean.Food;
import com.skc.springbootdemo.bean.Skc;
import com.skc.springbootdemo.config.FoodConfig;
import com.skc.springbootdemo.config.SkcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @RestController的功能相当于@Controller+@ResponseBody。
 *
 */
@Controller
//    @Controller
public class HelloController {

    @Autowired
    private SkcConfig skcConfig;

    @Autowired
    private FoodConfig foodConfig;

//    @Value("${skc}")
//    private String name;

    @RequestMapping("/hello")
    public Food sayHello(){
//        Skc skc = new Skc();
//        skc.setName(skcConfig.getName());
//        skc.setSex(skcConfig.getSex());
//        skc.setAge(skcConfig.getAge());
//        ModelAndView modelAndView = new ModelAndView();
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setSoup(foodConfig.getSoup());
        food.setVegetable(foodConfig.getVegetable());
        return food;
    }

    @RequestMapping("/template")
    public String thymeleaf(Model model){
        String template = "thymeleaf";
        model.addAttribute("template",template);
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setSoup(foodConfig.getSoup());
        food.setVegetable(foodConfig.getVegetable());
        model.addAttribute("food",food);
        return "thymeleaf";//页面不需要加后缀了。
    }
    @RequestMapping("/hi")
    public String test(){
        return "thymeleaf2";
    }

}
