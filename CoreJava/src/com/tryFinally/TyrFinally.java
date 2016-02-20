package com.tryFinally;

public class TyrFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TyrFinally finally1= new TyrFinally();
		
		System.out.println(finally1.getBoolean());
	}

	@SuppressWarnings("finally")
	private boolean getBoolean() {
		try{}
		catch(NullPointerException e){}
		// TODO Auto-generated method stub
		try{
			return true;
		} finally {
			return false;
		}
	}

}
