package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_DemoWebShopActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Computers')]"))).build().perform();
		a1.click(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).build().perform();
		Thread.sleep(2000);
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.close();
	}


}
