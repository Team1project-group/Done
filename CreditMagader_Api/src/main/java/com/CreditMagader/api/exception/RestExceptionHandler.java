package com.CreditMagader.api.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(CreditMagerIdNotPresent.class)
	public ResponseEntity<ApiError> creditManagerIdNotFoundExceptionHandler(CreditMagerIdNotPresent c,HttpServletRequest request)
	{
		ApiError ae = new ApiError();
		ae.setCode(HttpStatus.NOT_FOUND.value());
		ae.setError(HttpStatus.NOT_FOUND);
		ae.setMessage(c.getMessage());
		ae.setDateTime(new Date());
		ae.setPath(request.getRequestURI());
		ae.setTrace(c.toString());
		return new ResponseEntity<ApiError>(ae,HttpStatus.NOT_FOUND);
	}

}
