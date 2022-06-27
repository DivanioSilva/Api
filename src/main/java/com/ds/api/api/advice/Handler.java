package com.ds.api.api.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class Handler {
    @ExceptionHandler(Exception.class)
    public Exception handle(Exception ex,
                                         HttpServletRequest request, HttpServletResponse response) {
        return ex;
    }
}
