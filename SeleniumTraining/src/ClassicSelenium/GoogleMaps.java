package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMaps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9394059,77.6187622,12.9z");
		
		WebElement direction=driver.findElement(By.xpath("//button[@id='hArJGc']"));
		direction.click();
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']"));
		from.sendKeys("Ramanagara");
		
		WebElement searchfrom=driver.findElement(By.xpath("(//button[@data-tooltip='Search'])[1]"));
		searchfrom.click();
		
		Thread.sleep(2000);
		WebElement to=driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']"));
		to.sendKeys("Kanakapura");
		
		WebElement searchto=driver.findElement(By.xpath("(//button[@data-tooltip='Search'])[2]"));
		searchto.click();

	}
}