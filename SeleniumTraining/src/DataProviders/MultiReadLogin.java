package DataProviders;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNgTraining.BaseTest;
public class MultiReadLogin extends BaseTest{
			@Test(dataProvider="Login")
			public void testCase(String un, String pwd)
			{
				System.out.println(un);
				System.out.println(pwd);
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("http://demowebshop.tricentis.com/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				WebElement loginLink = driver.findElement(By.linkText("Log in"));
				loginLink.click();
				
				WebElement Email = driver.findElement(By.id("Email"));
				Email.sendKeys(un);
				
				WebElement password = driver.findElement(By.name("Password"));
				password.sendKeys(pwd);
				driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
				Reporter.log("logged-in", true);
				driver.findElement(By.xpath("//a[text()='Log out']")).click();
			}
			@DataProvider(name="Login", parallel= true)
			public Object[][] testData()throws Throwable
			{
				File file=new File("./testData/TestData.xlsx");
				FileInputStream fis =new FileInputStream(file);
				Workbook workbook=WorkbookFactory.create(fis);
				Sheet sheet=workbook.getSheet("Login");
				
				int row_count=sheet.getPhysicalNumberOfRows();
				int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
				
				Object[][] data=new Object[row_count-1][col_count];
				
				for(int i=0;i<row_count-1;i++)
				{
					for(int j=0;j<col_count;j++)
					{
						data[i][j]=sheet.getRow(i+1).getCell(j).toString();
					}
				}
				return data;
			}
	}

