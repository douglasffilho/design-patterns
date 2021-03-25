package br.com.douglasffillho.designpatterns.controller.handler;

import br.com.douglasffillho.designpatterns.error.OrderNotFoundError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class NotFoundExceptionHandler {

    @ExceptionHandler(OrderNotFoundError.class)
    public ResponseEntity<Map<String, String>> handleOrderNotFoundException(OrderNotFoundError error) {
        final Map<String, String> response = new HashMap<>();
        response.put("message", error.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}
