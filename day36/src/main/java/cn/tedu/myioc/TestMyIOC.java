package cn.tedu.myioc;

public class TestMyIOC {
    public static void main(String[] args) throws Exception {
        MyIOC mine = new MyIOC();
        Object user = mine.getBean("u.ser");
        Object dept = mine.getBean("dept");
        Object order = mine.getBean("order");

        System.out.println(user);
        System.out.println(dept);
        System.out.println(order);

    }
}
