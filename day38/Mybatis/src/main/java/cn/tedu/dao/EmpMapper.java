package cn.tedu.dao;

import cn.tedu.pojo.Emp;
import java.util.List;

public interface EmpMapper {
    List<Emp> getAll();
    List<Emp> getByid(int id);
    List<Emp> getByIdEname(Emp emp);
    List<Emp> getByIds(List list);
}
