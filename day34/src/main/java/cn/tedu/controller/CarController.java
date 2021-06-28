package cn.tedu.controller;
//控制层
import cn.tedu.pojo.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//接受浏览器的请求
@RequestMapping("/car")//按照指定地址访问
public class CarController {
    @RequestMapping("/get")//按照指定地址访问
    public String get(){
//        Car car = new Car();
//        car.getId();
        System.out.println("访问成功");
        return new Car().toString();
    }
}
