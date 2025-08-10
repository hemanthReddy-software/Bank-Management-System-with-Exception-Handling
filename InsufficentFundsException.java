package com.sathya.bank;

@SuppressWarnings("serial")
public class InsufficentFundsException extends RuntimeException{
	public InsufficentFundsException(String message) {
		super(message);
		
	}

}
