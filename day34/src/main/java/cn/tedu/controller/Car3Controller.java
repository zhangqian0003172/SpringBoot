package cn.tedu.controller;

import cn.tedu.pojo.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/car3")
//测试springmvc自动解析请求参数
public class Car3Controller {
    //利用springMVC框架解析数据
    //get方式
    @RequestMapping("/add")//和地址栏里的url匹配
    public void add(int id){
        System.out.println(id);
    }
    @RequestMapping("/insert")
    public String add(int id,String name,int age){
        System.out.println(id + name + age);
        return id + name + age;
    }
    @RequestMapping("/insert1")
    public Car add(Car car){
        System.out.println(car);
        return car;
    }
    //restful方式
    //{id}是restful的特需语法：从地址栏里获取参数的值
    @RequestMapping("/insert2/{id}")
    public int insert2(
            //@PathVariable解析地址栏里的数据
            @PathVariable int id){
        System.out.println(id);
        return id;
    }
    @RequestMapping("/insert2/{id}/{name}/{age}")
    public String insert2(
            //@PathVariable解析地址栏里的数据
            @PathVariable int id,@PathVariable String name ,@PathVariable int age){
        System.out.println(id+name+age);
        return id+name+age;
    }


    //手动解析url地址栏的数据
    public static void mine(){
        String url = "http://localhost:8080/car/insert?id=1&name=张三&age=18";
        String[] split = url.substring(url.lastIndexOf("?")+1).split("&");
        for(String a:split){
            String[] split1 = a.split("=");
            System.out.println(split1[1]);
        }
        System.out.println(Arrays.toString(split));

    }
}
