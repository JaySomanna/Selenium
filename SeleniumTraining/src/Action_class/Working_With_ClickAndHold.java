package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_ClickAndHold {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement rome= driver.findElement(By.xpath("//div[@id='box6']"));
		Actions a1=new Actions(driver);
		a1.clickAndHold(rome).build().perform();
		
		Thread.sleep(200);
		a1.release(driver.findElement(By.xpath("//div[@id='box106']"))).build().perform();
		
	}

}
