package cn.tedu.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//自定义拦截器：在方法执行前后添加与业务无关的功能
//@Component
public class MyInterceptor  implements HandlerInterceptor {
    long start;
    @Override//在方法执行前调用  调用preHandle
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //计时开始
        start = System.currentTimeMillis();
        System.out.println("开始准备执行了！");
        return true;//放行 继续执行后面的功能
    }

    @Override//在方法执行后调用 调用postHandle
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long end = System.currentTimeMillis();
        System.out.println("方法执行了："+(end-start)+"ms");
    }

    @Override//都完成后调用
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("资源已经被释放");
    }
}
