package com.project.cometa.Exception;

public class ResourceNotFoundExceptionIntercept extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExceptionIntercept(String msg) {
		super(msg);
 	}
}
