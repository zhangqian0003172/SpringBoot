package cn.tedu.TestMVC.Controller;

import cn.tedu.TestMVC.Pojo.Student;
import cn.tedu.TestMVC.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService StudentServiceImpl;
    @RequestMapping("/get")
    public Student get(){
        return StudentServiceImpl.get();
    }

}
