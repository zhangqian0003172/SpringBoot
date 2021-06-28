package cn.tedu.controller;

import cn.tedu.pojo.Student;
import cn.tedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentConteroller {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/get")
    public Student get(){
        return studentService.get();
    }
}
