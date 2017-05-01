package to_the_new;

public class BaseConversion{
	public static void main( String [] args )
	{
		String inputNo;
		String convertedNo;
		int toBase, fromBase, intVal;
		try{
			//To read the number and the bases in which the conversion needs to be performed
			
			inputNo = "15";
			fromBase = 10;
			toBase = 5;
			intVal = Integer.valueOf( inputNo, fromBase );
			convertedNo = Integer.toString( intVal , toBase );
			System.out.println(convertedNo);
		}
		catch( Exception e )
		{
			
			main(args);
		}
	}
}