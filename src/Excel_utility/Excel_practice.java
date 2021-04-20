package Excel_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excel_practice {
	
	public  static ArrayList<String> readData(String testsheetname, String testcase) throws IOException {
		
		ArrayList<String> ar = new ArrayList<>();
		FileInputStream fis = new FileInputStream("E:/Data_driven/excelread.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sh=workbook.getNumberOfSheets();
		
	
		
		
		for(int i=0;i<sh;i++)
			{
			if (workbook.getSheetName(i).equalsIgnoreCase(testsheetname))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				System.out.println(sheet);
				
		Iterator<Row>	row  =  sheet.iterator();
		Row firstRow=row.next();
	
		Iterator<org.apache.poi.ss.usermodel.Cell> ce=firstRow.cellIterator();
		//Iterator<org.apache.poi.ss.usermodel.Cell> cell=firstRow.cellIterator();
		
		int k=0;
		int column=0;
		while(ce.hasNext())
		{
			org.apache.poi.ss.usermodel.Cell value=ce.next();
			
	if (value.getStringCellValue().equalsIgnoreCase("Test Cases")) {
			column=k;	
				
			
		}
	k++;
				
			}
		
		System.out.println(column);
		
		while (row.hasNext())
		{
			Row r=row.next();
			
			if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase))
			{
			Iterator<org.apache.poi.ss.usermodel.Cell> cell=r.cellIterator();
			 while(cell.hasNext())
			 {
				 /*String cell_value=cell.next().getStringCellValue();
				 
				 System.out.println("String cell value is "+cell_value);*/
				 
				 ar.add(cell.next().getStringCellValue());
				 
				 System.out.println(ar);
			 }
			}
			
		}  
		
			}
	}
		return ar;
		
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//readData("login");
	}
}

			
			
	



