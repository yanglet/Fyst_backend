package com.project.foryourskintype.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("Interceptor 실행");
        HttpSession session = request.getSession(false);

        if(session == null || session.getAttribute("key") == null){
            log.info("미인증 사용자");
            return false;
        }
        return true;
    }
}
