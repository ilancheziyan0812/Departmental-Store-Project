package com.exception;

public class ProductNotFoundException extends RuntimeException{

	String message;
	public ProductNotFoundException(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}
}
