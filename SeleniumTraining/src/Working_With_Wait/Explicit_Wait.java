package Working_With_Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");	  

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']")));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("JAYS");	
	}

}