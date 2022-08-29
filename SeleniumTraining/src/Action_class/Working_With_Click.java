package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("(//a[text()='Men'])[1]"))).build().perform();
		
		//act.moveToElement(driver.findElement(By.xpath("(//a[text()='Jeans'])[1]"))).click().build().perform();
		
	}

}
