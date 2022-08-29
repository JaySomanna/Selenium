package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProviders {
	@Test(dataProvider = "login")
	public void loginTestCase(String username, String Password) {
		System.out.println(username+" "+Password);
	}
	
	
	@DataProvider(name = "login")
	public Object[][] testData(){
		Object[][] data=new Object[3][2];
		data[0][0]="RAJ";
		data[0][1]="123";
		data[1][0]="Vijju";
		data[1][1]="456";
		data[2][0]="Sajju";
		data[2][1]="789";
		return data;
	} 
}