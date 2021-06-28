package cn.tedu.spring;

import cn.tedu.Hello;
import cn.tedu.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试IOC
public class TestIOC {
    public static void main(String[] args) {
        //加载spring的核心配置文件xml
        ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-config.xml");
        //从框架里获取对象
        // 好处 -- spring容器里bean的都是单例 只有一个实例
        Object h = spring.getBean("hello");
        Hello hh = (Hello)h;
        hh.get();
        System.out.println(h);

        User u = (User) spring.getBean("user");
        u.get();
        System.out.println(u);

    }
}
