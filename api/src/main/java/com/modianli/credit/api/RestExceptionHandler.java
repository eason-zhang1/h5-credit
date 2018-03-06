package com.modianli.credit.api;

import com.modianli.credit.common.AppException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler(AppException.class)
  public ResponseEntity<Object> handlerResourceNotFoundException(AppException ex, WebRequest request) {
	log.debug("exception message: {}", ex.toString());
	log.error("exception: {}", ex);
	return new ResponseEntity<>(ex.getBasicError().getMessage(), ex.getBasicError().getCode());
  }

  @ExceptionHandler(value = {
	  //AccessDeniedException.class,
	  //BadCredentialsException.class
	  RuntimeException.class
  })
  public ResponseEntity<Object> handlerForbiddenException(RuntimeException ex, WebRequest request) {
	log.debug("exception message: {}", ex.toString());
	log.error("exception:", ex);
	return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
  }
}
