package Action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_KeyDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions a1=new Actions(driver);
		a1.keyDown(Keys.SHIFT).build().perform();
		
		Thread.sleep(2000);
		
		a1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		a1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		a1.sendKeys(Keys.TAB).build().perform();
		a1.sendKeys(Keys.NULL);
		
		a1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		a1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
