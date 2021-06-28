package cn.tedu.TestMVC.Service;

import cn.tedu.TestMVC.Pojo.Student;
import org.springframework.stereotype.Service;

@Service
public class StuentServiceImpl implements StudentService{
    @Override
    public Student get() {
        Student s = new Student(114477,"张千",21);
        return s;
    }
}
