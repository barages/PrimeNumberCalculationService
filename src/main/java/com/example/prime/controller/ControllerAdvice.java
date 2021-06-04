package com.example.prime.controller;

import com.example.prime.exceptions.ErrorResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<ErrorResult> handleNotNumberException(){
      ErrorResult error =   ErrorResult.builder()
                 .message("Please provide integer value to calculate ").build();
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
