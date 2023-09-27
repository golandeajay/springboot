package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExGlobally {

	@ExceptionHandler(value = { CustomerIdNotFound.class })
	public ResponseEntity<Object> CustomerIdNotFoundException(CustomerIdNotFound customerIdNotFound) {

		CustomerException customerException = new CustomerException(customerIdNotFound.getMessage(),
				customerIdNotFound.getCause(), HttpStatus.NOT_FOUND);

		return new ResponseEntity<>(customerException, HttpStatus.NOT_FOUND);

	}

}
