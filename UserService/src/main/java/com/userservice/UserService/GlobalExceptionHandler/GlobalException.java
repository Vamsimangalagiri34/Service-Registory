package com.userservice.UserService.GlobalExceptionHandler;

import com.userservice.UserService.CustomException.ErrorResponse;
import com.userservice.UserService.CustomException.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?> customException(UserNotFoundException userNotFoundException){
        System.out.println(userNotFoundException.getError()+"   "+userNotFoundException.getHttpStatus());
        return  ResponseEntity.status(404).body(new ErrorResponse(userNotFoundException.getError(),userNotFoundException.getHttpStatus()));
    }
}
