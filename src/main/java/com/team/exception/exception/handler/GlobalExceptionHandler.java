package com.team.exception.exception.handler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.team.exception.BusinessException;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Object> handelBusinessException(HttpServletRequest request,BusinessException ex){
		Map<String,Object> body=new HashMap<String,Object>();
		body.put("Status", HttpStatus.PRECONDITION_FAILED.value());
		body.put("path", request.getMethod());
		body.put("Time", LocalDateTime.now());
		body.put("message","BusinessException throws with error : "+ex.getMessage());
		return new ResponseEntity<Object>(body,HttpStatus.PRECONDITION_FAILED);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handelTechnicalException(HttpServletRequest request,Exception ex){
		Map<String,Object> body=new HashMap<String,Object>();
		body.put("Status", HttpStatus.NOT_ACCEPTABLE.value());
		body.put("path", request.getMethod());
		body.put("Time", LocalDateTime.now());
		body.put("message","TechnicalException throws with error : "+ex.getMessage());
		return new ResponseEntity<Object>(body,HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	

}
