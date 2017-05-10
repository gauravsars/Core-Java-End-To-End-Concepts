import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcel {
	
	public void updateExcel(){
	try {
		FileInputStream file = new FileInputStream(new File("C:\\Users\\Gaurabh\\Documents\\test.xlsx"));

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		
		
		
		Map<String, Object[]> data = new HashMap<String, Object[]>();
		data.put("5", new Object[] {4d, "ddhn", 1500000d});
		data.put("6", new Object[] {5d, "Samdf", 800000d});
		data.put("7", new Object[] {4d, "dfdfan", 700000d});
		
		//initially it will take lastrownum as 0 and append the first row from the beginning.
		
		int rowCount = sheet.getLastRowNum();
		
		
		for (String id : data.keySet()) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Object [] objArr = data.get(id);
            
            
            int cellnum = 0;
    		for (Object obj : objArr) {
    			Cell cell = row.createCell(cellnum++);
    			if(obj instanceof Date) 
    				cell.setCellValue((Date)obj);
    			else if(obj instanceof Boolean)
    				cell.setCellValue((Boolean)obj);
    			else if(obj instanceof String)
    				cell.setCellValue((String)obj);
    			else if(obj instanceof Double)
    				cell.setCellValue((Double)obj);
    		}
            
            

        }
		
		
		try {
			FileOutputStream out = 
					new FileOutputStream(new File("C:\\Users\\Gaurabh\\Documents\\test.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("Excel written successfully..");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	catch(Exception e){
		
		System.out.println("ABCD");
		
	}
	}
}