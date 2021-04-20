package Excel_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadUtility {
	
	
public  static Object[][] readData(String testsheetname) throws IOException {
		
	
		FileInputStream fis = new FileInputStream("E:/Data_driven/excelread.xlsx");
		Object[][] obj= null;
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sh=workbook.getNumberOfSheets();
		
	
		
		
		for(int i=0;i<sh;i++)
			{
			if (workbook.getSheetName(i).equalsIgnoreCase(testsheetname))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				System.out.println(sheet);
				
		 obj=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int j=0;i<sheet.getLastRowNum();i++)
		{
			for (int k=0;j<sheet.getRow(j).getLastCellNum();j++)
			{
				obj[j][k]=sheet.getRow(j+1).getCell(k).toString();
				
			}
		}
				
				
				
				
				
			}
			}
		return obj;
				
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
