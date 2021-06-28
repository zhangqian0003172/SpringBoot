package cn.tedu.service;
//Carservice 的实现类
import cn.tedu.dao.CarMapper;
import cn.tedu.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carMapper;//Service层 调用Dao层
    @Override
    public Car get() {
        return carMapper.getAll();


    }
}
