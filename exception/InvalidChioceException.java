package com.exception;

public class InvalidChioceException extends RuntimeException {

	String message;
	
	public InvalidChioceException(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}
}
