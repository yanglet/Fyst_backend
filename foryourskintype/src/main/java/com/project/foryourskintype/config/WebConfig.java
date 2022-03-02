package com.project.foryourskintype.config;

import com.project.foryourskintype.interceptor.LoginCheckInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginCheckInterceptor())
                .order(1)
                .addPathPatterns("/**")
                .excludePathPatterns("/login", "/signup",
                        "/logout", "/items", "/items/drjart",
                        "/items/innisfree", "/items/sidmool", "/items/beplain",
                        "/items/brand", "/items/skintype");
    }
}
