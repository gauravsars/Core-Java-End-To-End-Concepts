
public class initilizeClass {

	public static final String str;
	String str1;
	 // Constructor
    public initilizeClass() {
        System.out.println("constructor - IAACTINU");
        System.out.println(" str "+str);
    }

    // Instance init block
    {
        System.out.println("instance - IAACTINU");
        
        
    }
    // Static init block
    static {
    	
    	str = new String("asdff"); 
        System.out.println("static - IAACTINU");
    }
	
    public static void main(String asd[]){
    	
    	new initilizeClass();
    }
    
    
}
