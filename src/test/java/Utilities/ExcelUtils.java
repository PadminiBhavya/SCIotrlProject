package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	private static final String XL_FILEPATH= System.getProperty("user.dir")
		    + "\\src\\test\\java\\TestData\\TestData_1.xlsx";
	private static Workbook workbook;
	
	static {
		
		try {
			try {
				workbook = WorkbookFactory.create(new FileInputStream(XL_FILEPATH));
			} catch (EncryptedDocumentException | InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		catch(IOException e)
			{
			e.printStackTrace();
			}
		   }

public static String getStringData(String sheetName, int rowNumber, int cellNumber)
{
	return workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).toString();
}

public static double getNumericData(String sheetName, int rowNumber, int cellNumber)
{
	return workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getNumericCellValue();
}

public static boolean getBooleanData(String sheetName, int rowNumber, int cellNumer)
{
	return workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumer).getBooleanCellValue();
}

public static Date getDate(String sheetname, int rowNumber, int cellNumber)
{
	return workbook.getSheet(sheetname).getRow(rowNumber).getCell(cellNumber).getDateCellValue();
}

public static String[][] getMultipleData(String sheetName)
{
	Sheet sheet = workbook.getSheet(sheetName);
	int rowsCount = sheet.getPhysicalNumberOfRows();
	String [][] sarr = new String[rowsCount-1][];
	for(int i=1, k=0;i<=rowsCount-1;i++,k++)
	{
		int cellsCount = sheet.getPhysicalNumberOfRows();
		sarr[k] = new String[cellsCount];
		for(int j=0; j<=cellsCount-1; j++) {
			sarr[k][j] = sheet.getRow(i).getCell(j).toString();
		}
	}
	return sarr;
	
	}
}

