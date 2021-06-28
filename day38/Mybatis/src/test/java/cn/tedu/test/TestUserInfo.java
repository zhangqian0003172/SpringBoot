package cn.tedu.test;

import cn.tedu.dao.UserInfoMapper;
import cn.tedu.pojo.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUserInfo {
    public static void main(String[] args) throws IOException {
        SqlSession session = method();
        UserInfoMapper userInfoMapper = session.getMapper(UserInfoMapper.class);
        List<UserInfo> all = userInfoMapper.getAll();
        for (UserInfo userInfo : all) {
            System.out.println(userInfo);
        }
    }

    private static SqlSession method() throws IOException {
        InputStream in = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        return  session;
    }
}
