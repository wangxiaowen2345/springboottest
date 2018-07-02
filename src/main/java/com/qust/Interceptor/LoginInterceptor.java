package com.qust.Interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    //在控制器执行前调用
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        logger.info("----执行preHandle方法-->01");
        if (true) {
            return true;  //通过拦截器，继续执行请求
        } else {
            return false;  //没有通过拦截器，返回登录页面
        }
    }
    //在后端控制器执行后调用
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        logger.info("执行postHandle方法-->02");
        super.postHandle(request, response, handler, modelAndView);
    }
    //整个请求执行完成后调用
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        logger.info("执行afterCompletion方法-->03");
        super.afterCompletion(request, response, handler, ex);
    }

}
