package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_TestCase {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).build().perform();
		
		act.click(driver.findElement(By.xpath("//a[text()='Mobiles']"))).build().perform();
		act.click(driver.findElement(By.xpath("//a[text()='Customer Service']"))).build().perform();
		act.click(driver.findElement(By.xpath("//a[text()='Books']"))).build().perform();
	}

}
