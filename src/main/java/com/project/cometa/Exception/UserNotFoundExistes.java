package com.project.cometa.Exception;

public class UserNotFoundExistes extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public UserNotFoundExistes(String msg) {
		super(msg);
 	}
}
