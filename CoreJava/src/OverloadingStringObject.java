
public class OverloadingStringObject {

	
	public Object show(Object obj){
		System.out.println("In Object ");
		return obj;
	}
	
	public String show(String str){
		System.out.println("In String ");
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object str =  (String) new OverloadingStringObject().show(new String("1"));
		
		
		
		
	}

}
