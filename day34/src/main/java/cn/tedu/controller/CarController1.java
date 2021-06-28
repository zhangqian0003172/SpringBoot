package cn.tedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController1 {
    @RequestMapping("/save")
    public void save(){
        System.out.println("访问成功save");
    }

    @RequestMapping("get2")
    public String get(){
        return "123";
    }
}
