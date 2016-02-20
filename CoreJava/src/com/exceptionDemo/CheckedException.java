package com.exceptionDemo;

public class CheckedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public CheckedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramString
	 * @param paramThrowable
	 * @param paramBoolean1
	 * @param paramBoolean2
	 */
	public CheckedException(String paramString, Throwable paramThrowable,
			boolean paramBoolean1, boolean paramBoolean2) {
		super(paramString, paramThrowable, paramBoolean1, paramBoolean2);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramString
	 * @param paramThrowable
	 */
	public CheckedException(String paramString, Throwable paramThrowable) {
		super(paramString, paramThrowable);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramString
	 */
	public CheckedException(String paramString) {
		super(paramString);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramThrowable
	 */
	public CheckedException(Throwable paramThrowable) {
		super(paramThrowable);
		// TODO Auto-generated constructor stub
	}

	
}
