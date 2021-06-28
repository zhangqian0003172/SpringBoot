package cn.tedu.Mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//测试Mybatis
public class TestMybatis {
    public static void main(String[] args) throws IOException {
        //1，加载核心配置文件 mybatis-config.xml
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //2，创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3, 创建会话
        SqlSession session = factory.openSession();
        //4，执行SQL
        List<User> list = session.selectList("userMapperNS.getAll");
        //处理返回值
        for (User user : list) {
            System.out.println(user);

        }
    }

}
