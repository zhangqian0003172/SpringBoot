package cn.tedu.controlle;

import cn.tedu.pojo.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestCar")
public class TestCarControlle {
    @RequestMapping("Testget")
    public String get(){
        return "连接成功";
    }

    //解析get
    @RequestMapping("Testget1")
    public String get(int id){
        return "id="+id;
    }
    @RequestMapping("Testget2")
    public String get(int id,String name,int age){
        return "id="+id+" name="+name+" age="+age;
    }
    @RequestMapping("TestgetAll")
    public Car get(Car car){
        return car;
    }


    @RequestMapping("Testrestful")
    public String restful(){
        return "连接成功";
    }

    //解析restful
    @RequestMapping("Testrestful/{id}")
    public String restful(@PathVariable int id){
        return "id="+id;
    }
    @RequestMapping("Testrestful/{id}/{name}/{age}")
    public String restful(@PathVariable int id,
                          @PathVariable String name,
                          @PathVariable int age){

        return "id="+id+" name="+name+" age="+age;
    }

}
