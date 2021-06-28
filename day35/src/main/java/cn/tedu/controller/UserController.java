package cn.tedu.controller;

import cn.tedu.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/add")
    public String add(User user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/SSM?characterEncoding=utf8";
        String username = "root";
        String password = "ioot";
        Connection con = DriverManager.getConnection(url, username, password);
        String sql = "insert into user values(?,?,?)";
        PreparedStatement pr = con.prepareStatement(sql);
        pr.setInt(1,user.getId());
        pr.setString(2,user.getName());
        pr.setInt(3,user.getAge());
        int i = pr.executeUpdate();
        if(i>0){
            pr.close();
            con.close();
            return"插入成功";

        }else {
            pr.close();
            con.close();
            return "插入失败";
        }
    }
}
