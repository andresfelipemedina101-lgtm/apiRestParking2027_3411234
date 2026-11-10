package com.sena.apiparking.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	private final HttpStatus status ; 
	
	public ApiException(HttpStatus status, String Message) {
		super(message);
		this.status = status;
		
	}
	
	public static ApiException notFound(String msg) {
		return new ApiException(HttpStatus.NOT_FOUND, msg);
		
	}
	public static ApiException notFound(String msg) {
		return new ApiException(HttpStatus.NOT_FOUND, msg);
	}
	public static ApiException notFound(String msg) {
		return new ApiException(HttpStatus.NOT_FOUND, msg);
		
	}
}
