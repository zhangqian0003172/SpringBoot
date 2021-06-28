package cn.tedu.TestMVC.Service;

import cn.tedu.TestMVC.Pojo.Car;
import org.springframework.stereotype.Service;

@Service//  和@Component作用是一样的 底层调用了@Component
public class CarServiceImpl implements CarService{
    @Override
    public Car get() {
        Car c = new Car("保时捷","红色",641000.0);
        return c;
    }
}
