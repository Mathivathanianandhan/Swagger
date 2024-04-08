package com.postgres.checkingId.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionHands extends Exception {
	public ExceptionHands(String message) {
        super(message);
    }
	 public ExceptionHands(String message, Throwable cause) {
	        super(message, cause);
	    }
}