package cn.tedu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;

public class Student {
    private String name;
    private int age;
    private int sex;
//    private String[] hobby;
    private int[] hobby;
    private int edu;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date intime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

//    public String[] getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String[] hobby) {
//        this.hobby = hobby;
//    }
    public int[] getHobby() {
    return hobby;
}

    public void setHobby(int[] hobby) {
        this.hobby = hobby;
    }

    public int getEdu() {
        return edu;
    }

    public void setEdu(int edu) {
        this.edu = edu;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hobby=" + Arrays.toString(hobby) +
                ", edu=" + edu +
                ", intime=" + intime +
                '}';
    }
}
