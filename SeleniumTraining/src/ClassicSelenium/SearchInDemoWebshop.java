package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInDemoWebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		
		WebElement search=driver.findElement(By.cssSelector("input[value=\"Search store\"]"));
		search.sendKeys("computers");
		 
		Thread.sleep(10000);
		
		WebElement searchbutton=driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		searchbutton.click();
		
	}

}
