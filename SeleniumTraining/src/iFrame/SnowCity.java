package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnowCity {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/contact-us/");	
		
		WebElement google=driver.findElement(By.xpath("//iframe[@referrerpolicy='no-referrer-when-downgrade']"));
		driver.switchTo().frame(google);
		
		//WebElement snowcity=driver.findElement(By.xpath("//iframe[@aria-hidden='true']"));
		//driver.switchTo().frame(snowcity);
		
		Actions act=new Actions(driver);
		WebElement dir=driver.findElement(By.xpath("//a[@aria-label='Get directions to this location on Google Maps.']"));
		act.moveToElement(dir).build().perform();
		Thread.sleep(2000);
		dir.click();
	}

}
