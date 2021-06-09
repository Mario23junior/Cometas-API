package com.project.cometa.ControllerAdvice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.project.cometa.Exception.ResourceNotFoundExceptionIntercept;

@RestControllerAdvice
public class ControllerAdviceErrosCustom {
    
	@ExceptionHandler(ResourceNotFoundExceptionIntercept.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
 	  public ApiErros resourceNotFoundException(ResourceNotFoundExceptionIntercept ex, WebRequest request) {
			ApiErros message = new ApiErros(
					HttpStatus.NOT_FOUND.value(),
					new Date(),
					ex.getMessage(),
					request.getDescription(false));
			
			return message;
		}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ApiErros globalExceptionCustom(Exception ex, WebRequest request) {
		ApiErros messageGlobal = new ApiErros(
				 HttpStatus.INTERNAL_SERVER_ERROR.value(),
				 new Date(),
				 ex.getMessage(),
				 request.getDescription(false));
		return messageGlobal;
	}
}
