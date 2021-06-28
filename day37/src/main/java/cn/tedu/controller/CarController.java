package cn.tedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/save")
    public void save(){
        System.out.println("save正在执行");
    }
    @RequestMapping("/get")
    public void get(){
        for (int i = 0; i < 100; i++) {
            System.out.println("get方法在执行");
        }
    }
}
