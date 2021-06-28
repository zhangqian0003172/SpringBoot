package cn.tedu.dao;

import cn.tedu.pojo.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentMapper {
    Student get(String name);
}
