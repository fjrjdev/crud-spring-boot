package com.attornatus.testetecnico.exceptiions;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@ControllerAdvice
public class GlobalExceptionHandler {
    static class ErrorResponse {
        private String message;
        private  String code;

        public ErrorResponse(String message, HttpStatus code) {
            this.message = message;
            this.code = String.valueOf(code);
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public ResponseEntity<Object> handleCustomException(ResourceNotFoundException ex) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        var errorResponse = new ErrorResponse(ex.getMessage(),status);
        return ResponseEntity.status(status).body(errorResponse);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAllExceptions(Exception ex) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        String message = "Erro interno do servidor";
        var errorResponse = new ErrorResponse(message, status);
        return ResponseEntity.status(status).body(errorResponse);
    }
}