package cn.tedu.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext spring = new  ClassPathXmlApplicationContext("spring-configs.xml");
//        method(spring);//自己注入
        method1(spring);//框架注入



    }

    private static void method1(ClassPathXmlApplicationContext spring) {
        Teacher t = (Teacher)spring.getBean("teacher");
        Student s1 = new Student();
        s1.setName("qq");

        System.out.println(t);
    }

    private static void method(ClassPathXmlApplicationContext spring) {
        Student s = (Student)spring.getBean("student");
        Teacher t1 = new Teacher();
        t1.name="张三";
        s.setTeacher(t1);
//        System.out.println(s.getTeacher());
        System.out.println(s);
    }
}
