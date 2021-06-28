package cn.tedu.myioc;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

//模拟spring实现ioc--控制反转（new）
public class MyIOC {
    //1.有那些Bean -- 有多个 为了查询效率高 存入list
    List<Bean> beans = new ArrayList();
    //准备Map 存数据{"user"= new User,"dept"= new Dept,"order"= new Order}
    Map<String,Object> map = new ConcurrentHashMap();
    //对象的初始化 在使用对象时，可直接调用
    public MyIOC() throws Exception {
        Bean b1 = new Bean("user","cn.tedu.myioc.User");
        Bean b2 = new Bean("dept","cn.tedu.myioc.Dept");
        Bean b3 = new Bean("order","cn.tedu.myioc.Order");
        //把准备好的bean存入list 方便后面查的块
        Collections.addAll(beans,b1,b2,b3);
        //完成IOC过程
        init();
    }
    //2.给Bean们创建对象--控制反转IOC
    // Map<key,value>  key是类的名字   value是类的对象
    public void init() throws Exception {
        //遍历list 获取每个bean
        for(Bean b:beans){
            //获取每个bean的beanId作为keymap
            String key = b.getBeanId();
            //获取每个bean的beanPath作为valuemap
            Object value = Class.forName(b.getBeanPath()).newInstance();
            map.put(key, value);
        }
    }
    //3.getBean()获取对象
    public Object getBean(String leiming){
        return map.get(leiming);
    }


}
