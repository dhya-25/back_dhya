package com.arabsoft.ajir.exception;

public class ProductNotFoundException extends RuntimeException {

	private String message;

	public ProductNotFoundException(String message) {
		super(message);
		this.message = message;
	}
}
