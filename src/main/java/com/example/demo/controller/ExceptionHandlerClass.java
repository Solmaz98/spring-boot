package com.example.demo.controller;

import com.example.demo.model.ExceptionDto;
import com.example.demo.model.NoDataFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerClass {

    @ExceptionHandler(NoDataFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionDto handle(NoDataFoundException exception){
        System.out.println("xeta aldim bura girdim " + exception.getMessage());
        return new ExceptionDto(HttpStatus.NOT_FOUND.value() ,exception.getMessage());
    }
}
