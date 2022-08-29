package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Switch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe.html");			
		WebElement frame1 = driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame1);
		
		
		WebElement latest = driver.findElement(By.xpath("//a[text()='LATEST']"));
		latest.click();
		driver.switchTo().defaultContent();
	
		WebElement frame2 = driver.findElement(By.id("FR2"));
		driver.switchTo().frame(frame2);
		WebElement search = driver.findElement(By.id("click-to-show"));
		search.click();
		driver.findElement(By.xpath("//input[@id='txt_sm_search']")).sendKeys("SAYNOTHING");		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google'")).click();
	}

}
