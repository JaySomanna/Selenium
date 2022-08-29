package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_WIth_RightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Right click
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		Thread.sleep(2000);

		driver.close();
		
		
		//Double click
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act1=new Actions(driver1);
		act1.doubleClick(driver1.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();
		
		Thread.sleep(2000);
		driver1.close();
		
	}

}
