package com.example.demo.model;

public class NoDataFoundException extends  RuntimeException{
    public NoDataFoundException(String message){
        super(message);
    }
}
