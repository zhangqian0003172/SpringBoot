package Test.IOC;

import cn.tedu.dao.Test;
import cn.tedu.spring.Hello1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-configs.xml");
        Hello1 h = (Hello1) spring.getBean("hello1");
        Test test = (Test)spring.getBean("Test");
        h.get();
        test.get();
    }
}