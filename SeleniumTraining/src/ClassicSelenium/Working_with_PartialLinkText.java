package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_PartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		Thread.sleep(5000);
		for(int i=1;i<=4;i++) {
		driver.findElement(By.xpath("//input[@id='pollanswers-"+i+"']")).click();	
		}
		driver.close();
	}

}
