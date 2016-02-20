
public class OfNullInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i= 11;

		
	OfNullInt int1 = new OfNullInt();
	
	System.out.println(int1.getInt());
	}

	public int getInt(){
		
		return (true?null:1);
	}
}
