package cn.tedu.myioc;
//spring 容器可以看成是Bean容器
public class Bean {
    private String beanId;//类名Bean
    private String beanPath;//类的全路径 cn.tedu.myioc.Bean
    //构造方法

    public Bean() {
    }
    public Bean(String beanId, String beanPath) {
        this.beanId = beanId;
        this.beanPath = beanPath;
    }

    //get/set
    public String getBeanId() {
        return beanId;
    }
    public void setBeanId(String beanId) {
        this.beanId = beanId;
    }
    public String getBeanPath() {
        return beanPath;
    }
    public void setBeanPath(String beanPath) {
        this.beanPath = beanPath;
    }
}
