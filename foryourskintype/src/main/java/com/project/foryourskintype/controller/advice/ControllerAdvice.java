package com.project.foryourskintype.controller.advice;

import com.project.foryourskintype.domain.ErrorResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("com.project.foryourskintype.controller")
public class ControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler
    public ErrorResult ArgExHandler(IllegalArgumentException e){
        return new ErrorResult("BAD_REQUEST!", "클라이언트 오류!");
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public ErrorResult defaultExHandler(Exception e){
        return new ErrorResult("SERVER_ERROR!", "제 잘못입니다ㅠ");
    }
}
