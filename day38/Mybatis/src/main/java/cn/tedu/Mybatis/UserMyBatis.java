package cn.tedu.Mybatis;

import cn.tedu.pojo.Dept;
import cn.tedu.pojo.Emp;
import cn.tedu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMyBatis {
    public static void main(String[] args) throws IOException {
        SqlSession session = method();
        method1(session);
        method2(session);
        method3(session);



    }

    private static void method3( SqlSession session) {
        List<Dept> list = session.selectList("DeptMapperNS.getAll");
        for (Dept dept : list) {
            System.out.println(dept);
        }
    }

    private static void method2( SqlSession session) {
        List<Emp> list = session.selectList("EmpMapperNS.getAll");
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    private static void method1( SqlSession session) {
        List<User> list = session.selectList("UserMapperNS.getAll");
        for (User user : list) {
            System.out.println(user);
        }
    }

    private static SqlSession method() throws IOException {
        InputStream in = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        return session;

    }
}
