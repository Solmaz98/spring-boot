package com.example.demo.model;

public class ExceptionDto {
    private Integer statusCode;
    private String ExceptionMessage;

    public ExceptionDto(Integer statusCode, String exceptionMessage) {
        this.statusCode = statusCode;
        ExceptionMessage = exceptionMessage;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getExceptionMessage() {
        return ExceptionMessage;
    }
}
