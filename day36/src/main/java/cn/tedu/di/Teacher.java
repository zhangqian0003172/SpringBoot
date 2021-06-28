package cn.tedu.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Teacher {
    String name = "Tony";
    @Autowired//相当于底层提供了get/set-- 自动装配
    private Student student;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
