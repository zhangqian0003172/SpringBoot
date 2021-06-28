package cn.tedu.service;

import cn.tedu.dao.StudentMapper;
import cn.tedu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class StudentServiceimpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student get() {
        String a = new Scanner(System.in).next();
        return studentMapper.get(a);
    }
}
