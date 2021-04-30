package com.edm.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetails {

	private String message;
	private String details;
	private int statusCode;

	public ErrorDetails(String message, String details, int statusCode) {
		super();
		this.message = message;
		this.details = details;
		this.statusCode = statusCode;
	}
}
