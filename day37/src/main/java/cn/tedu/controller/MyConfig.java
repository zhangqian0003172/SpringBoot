package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor my;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(my);
    }
}
