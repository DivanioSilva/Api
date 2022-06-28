package com.ds.api.api.advice;

import com.ds.api.api.exceptions.ExternalException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class Handler {
    @ExceptionHandler(Exception.class)
    public ExternalException handle(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        return ExternalException
                .builder()
                .message(ex.getMessage())
                .code(HttpServletResponse.SC_INTERNAL_SERVER_ERROR)
                .build();
    }
}
