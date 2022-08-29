package testNgTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	@Parameters("browser") //broser name must be given at runtime
	@BeforeSuite
	public void setUpBrowser(@Optional("chrome") String browserName) {
		if(browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.contains("firefox")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Browser name is not specified");
		}
	}
	
	@Test
	public void testcase() {
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void browserTearDown() {
		driver.close();
	}

}
