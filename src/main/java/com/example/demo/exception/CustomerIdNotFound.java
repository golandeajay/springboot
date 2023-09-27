package com.example.demo.exception;

public class CustomerIdNotFound extends RuntimeException {

	// private String msg;

	public CustomerIdNotFound(String msg) {
		super( msg);
	}

}
