

class StaticA{
	
	static void getShow(){
		System.out.println("StaticA getShow Method");
	}
	
}
class StaticB extends StaticA {
	
	static void getShow(){
		System.out.println("StaticA getShow Method");
	}
}




public class OverrideStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticA a = new StaticB();
		a.getShow();
	}

}
