
class X{
	
}
class Y extends X {
	
}
class Z extends Y{
	
}


class A1 {
	
	public int amount=10;
	
	private void show(){
		System.out.println(" Class A1");
	}
	
	public Object getString(){
		System.out.println("A Class");
		return "A String";
	}
	
	
	public Y callMethod (Y y){
		System.out.println(" Super Class A1 callMethod ");
		return y;
	}
	
}

class B1 extends A1{
	
	public int amount=30;
	
	private void show(){
		System.out.println(" Class B1");
	}
	
	public String getString(){
		System.out.println("A Class");
		return "A String";
	}
	
	public void display(){
		System.out.println(" Class B1 Display");
	}
	
	public Y callMethod (Z y){
		System.out.println(" Sub Class B1 callMethod ");
		return null;
	}
	
}
public class OverrideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		A1 a1= new B1();
		B1 b1= new B1();
		
		
		Y z= new Z();
		
		a1.callMethod(z); // Super Class A1 
		b1.callMethod(z); // Super Class A1
		
	
		
	}

}
