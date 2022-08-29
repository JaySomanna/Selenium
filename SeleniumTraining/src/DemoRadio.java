import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadio {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
		
		for(WebElement radioB:radio) {
			radioB.click();
		}
		
	}
	

}
