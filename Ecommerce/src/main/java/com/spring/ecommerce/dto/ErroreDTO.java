package com.spring.ecommerce.dto;

public class ErroreDTO {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErroreDTO(String message) {
		super();
		this.message = message;
	}
	

}
