package cn.tedu.test;

import cn.tedu.dao.DeptMapper;
import cn.tedu.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDept {
    public static void main(String[] args) throws IOException {
        SqlSession session = method();
        DeptMapper dao = session.getMapper(DeptMapper.class);
        List<Dept> list = dao.getAll();
        for (Dept dept : list) {
            System.out.println(dept);
        }
        System.out.println(dao.getOne());
        System.out.println(dao.getDname());
        List<Dept> byLoc = dao.getByLoc("一区");
        for (Dept dept : byLoc) {
            System.out.println(dept);
        }
        List<Dept> byId = dao.getById(5);
        for (Dept dept : byId) {
            System.out.println(dept);
        }
    }

    private static SqlSession method() throws IOException {
        InputStream in = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        //获取DeptMapper接口

        return session;
    }
}
