package testNgTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase02 {
	@Test
	public void selectMethods() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}
	
	
	@Test
	public void absolutePath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		WebElement search=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[6]/div/div[2]/div[2]/div[1]/a/div/img[@alt='Fashion']"));
		Thread.sleep(2000);
		search.click();
	}

}
