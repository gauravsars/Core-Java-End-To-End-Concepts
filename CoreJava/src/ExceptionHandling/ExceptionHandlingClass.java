package ExceptionHandling;


class MyException extends Exception{
	
}
class MyChildException extends MyException {
	
}


class ExceptionHandle{
	void method1() throws MyException{
		System.out.println("Method 1");
	}
	
	void method2() throws MyChildException{
		System.out.println("Method 2");
	}
}






public class ExceptionHandlingClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandle class1 = new ExceptionHandle();
		
		try {
			class1.method1();
		} catch (MyChildException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	

}
