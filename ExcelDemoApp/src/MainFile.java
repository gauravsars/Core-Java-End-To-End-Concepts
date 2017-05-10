
public class MainFile {
	
	public static void main(String[] args) {
		
		ReadExcel rexcel = new ReadExcel();
		
		rexcel.readFile();
		
		UpdateExcel uexcel = new UpdateExcel();
		
		uexcel.updateExcel();
		
		WriteExcel insertExcel = new WriteExcel();
		
		insertExcel.writeExcel();
		
		
		
	}

}
