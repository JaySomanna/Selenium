package DataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithMultiReadFromFile {
	@Test(dataProvider = "login")
	public void loginTestCase(String username, String Password) {
		System.out.println(username+" "+Password);
	}
	
	@DataProvider(name = "login")
	public Object[][] testData() throws EncryptedDocumentException, IOException{
	File file=new File("./testData/TestData.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("Login");
	
	int row_count=sheet.getPhysicalNumberOfRows();
	int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
	
	Object[][] data = new Object[row_count-1][col_count];
	for(int i=0;i<row_count-1;i++) {
		for(int j=0;j<col_count;j++) {
			data[i][j]=sheet.getRow(i+1).getCell(j).toString();
		}
	}
	return data;
	}
} 