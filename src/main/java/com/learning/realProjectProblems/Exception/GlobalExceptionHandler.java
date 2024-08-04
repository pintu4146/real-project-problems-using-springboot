package com.learning.realProjectProblems.Exception;

import com.learning.realProjectProblems.controller.UserController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LogManager.getLogger(UserController.class);
    @ExceptionHandler(MyCustomException.class)
    public ResponseEntity<Object> handleMyCustomException(MyCustomException ex) {
        // Log the exception
        logger.error("MyCustomException occurred:", ex.getMessage());
        // Return a custom error response (e.g., 400 Bad Request)
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAllExceptions(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unecpected error occured");
    }
}
