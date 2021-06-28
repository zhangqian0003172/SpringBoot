package cn.tedu;
//启动类
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

//是springboot提供的注解 标记着这个类是一个springboot的启动类
@SpringBootApplication
//是spring框架提供的注解 标记着这是一个controller层代码
@Controller
public class RunApp {
    public static void main(String[] args) {
        //指定需要启动的文件
        SpringApplication.run(RunApp.class);
    }
}
