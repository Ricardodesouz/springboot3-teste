package com.firtproject.project.resources.exceptiotn;

import com.firtproject.project.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String err = "resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
    StandardError error = new StandardError(Instant.now(),status.value(),err,e.getMessage(),request.getRequestURI());
    return ResponseEntity.status(status).body(error);

    }
}
