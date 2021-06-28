package cn.tedu.di;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;

//自己实现DI --模拟Autowired注解
public class TestMyDI {
    public static void main(String[] args) throws Exception{
        //获取Student类里的所有的属性（name/teacher）
        Class<Student> s = Student.class;
        // --Class提供getDecLaredFields
        Field[] fs = s.getDeclaredFields();//暴力反射所有属性
        // 遍历得到每个属性Field
        for (Field field : fs) {
            // --判断那个属性有@Autowred注解
            Autowired a = field.getAnnotation(Autowired.class);
            // if（有注解）{f.set() f.get()}
            if (a != null){
                //设置属性值 new Teacher()
                Student obj = s.newInstance();
                field.setAccessible(true);
                field.set(obj,new Teacher());
            }

        }

    }
}
