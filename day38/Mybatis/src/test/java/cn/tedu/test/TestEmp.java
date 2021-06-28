package cn.tedu.test;

import cn.tedu.dao.EmpMapper;
import cn.tedu.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) throws IOException {
        SqlSession session = method();
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        List<Emp> all = empMapper.getAll();
        System.out.println("获取所有值");
        for (Emp emp : all) {
            System.out.println(emp);
        }
        System.out.println("根据id获取值");
        List<Emp> byid = empMapper.getByid(500);
        for (Emp emp : byid) {
            System.out.println(emp);
        }
        System.out.println("根据id 和 ename 获取值");
        Emp emp1 = new Emp();
        emp1.setId(200);
        emp1.setEname("tony");
        List<Emp> byIdEname = empMapper.getByIdEname(emp1);
        for (Emp emp : byIdEname) {
            System.out.println(emp);
        }
        System.out.println("根据id 是100 或者200 或者 502的记录");
        List list = new ArrayList();
        Collections.addAll(list,100,200,502);
        List<Emp> byIds = empMapper.getByIds(list);
        for (Emp emp : byIds) {
            System.out.println(emp);
        }
    }

    private static SqlSession method() throws IOException {
        InputStream in = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        return session;
    }
}
