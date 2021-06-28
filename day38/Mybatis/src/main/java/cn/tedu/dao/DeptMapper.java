package cn.tedu.dao;

import cn.tedu.pojo.Dept;

import java.util.List;

//接口的全路径 = DeptMapper.xml里的namespace的值
//接口的方法名 =  DeptMapper.xml里的SQl的id值
public interface DeptMapper {
    List<Dept> getAll();
    Dept getOne();
    Dept getDname();
    List<Dept> getByLoc(String loc);
    List<Dept> getById(int id);
}
