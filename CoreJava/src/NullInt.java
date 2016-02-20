
public class NullInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i= 11;

		
	NullInt int1 = new NullInt();
	
	System.out.println(int1.getInt());
	}

	public int getInt(){
		
		return (true?null:1);
	}
}
