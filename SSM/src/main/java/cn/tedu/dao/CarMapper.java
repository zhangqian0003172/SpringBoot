package cn.tedu.dao;

import cn.tedu.pojo.Car;
import org.springframework.stereotype.Component;

//Mybatis的Dao层 用来操作数据库
@Component
public interface CarMapper {
    Car getAll();
}
