package cn.tedu.TestMVC.Controller;

import cn.tedu.TestMVC.Pojo.Car;
import cn.tedu.TestMVC.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car2")
public class CarController1 {
    @Autowired
    private CarService carService;
    @RequestMapping("/get")
    public Car get(){
        return carService.get();
    }
}
