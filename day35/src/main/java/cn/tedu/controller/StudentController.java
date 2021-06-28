package cn.tedu.controller;

import cn.tedu.pojo.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

@RestController
@RequestMapping("/stu")
@CrossOrigin(origins = "*")//解决跨域问题 放行所以请求
public class StudentController {
    @RequestMapping("/add")
    public String add(Student student) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/SSM?characterEncoding=utf8";
        String username = "root";
        String password = "ioot";
        Connection con = DriverManager.getConnection(url, username, password);
        String sql = "insert into student value(?,?,?,?,?,?)";
        PreparedStatement pr = con.prepareStatement(sql);
        pr.setString(1,student.getName());
        pr.setInt(2,student.getAge());
        pr.setInt(3,student.getSex());
        pr.setInt(4, Integer.parseInt(student.getHobby()[0]+""+student.getHobby()[1]+""+student.getHobby()[2]));
//        pr.setString(4, Arrays.toString(student.getHobby()));
        pr.setInt(5,student.getEdu());
        pr.setObject(6,student.getIntime());
        int i = pr.executeUpdate();
        if(i>0){
            return "插入成功";
        }else {
            return "插入失败";
        }

    }
}
