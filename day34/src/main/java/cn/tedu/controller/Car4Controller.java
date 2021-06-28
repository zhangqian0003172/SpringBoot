package cn.tedu.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car4")
public class Car4Controller {

    @RequestMapping("get")
    public String get(){
        return "连接成功";
    }
    @RequestMapping("get1")
    public String get1(String id){
        return "连接成功"+id;
    }
    @RequestMapping("get/{id}")
    public String get(@PathVariable String id){
        return "连接成功"+id;
    }
}
