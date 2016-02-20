package com.exceptionDemo;

public class UnCheckedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public UnCheckedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramString
	 * @param paramThrowable
	 * @param paramBoolean1
	 * @param paramBoolean2
	 */
	public UnCheckedException(String paramString, Throwable paramThrowable,
			boolean paramBoolean1, boolean paramBoolean2) {
		super(paramString, paramThrowable, paramBoolean1, paramBoolean2);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramString
	 * @param paramThrowable
	 */
	public UnCheckedException(String paramString, Throwable paramThrowable) {
		super(paramString, paramThrowable);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramString
	 */
	public UnCheckedException(String paramString) {
		super(paramString);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param paramThrowable
	 */
	public UnCheckedException(Throwable paramThrowable) {
		super(paramThrowable);
		// TODO Auto-generated constructor stub
	}

}
