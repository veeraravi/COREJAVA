package com.veera.exception.userdefineExcepion;

public class InvalidAmountToDeposit extends Exception {

	/**
	 * 
	 */
	public InvalidAmountToDeposit() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public InvalidAmountToDeposit(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidAmountToDeposit(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public InvalidAmountToDeposit(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidAmountToDeposit(Throwable cause) {
		super(cause);
	}

	
}
