package Action_class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_DuplicateLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).build().perform();
		
		
		act.click(driver.findElement(By.xpath("//a[text()='Mobiles']"))).build().perform();
		act.click(driver.findElement(By.xpath("//a[text()='Customer Service']"))).build().perform();
		act.click(driver.findElement(By.xpath("//a[text()='Books']"))).build().perform();
	

		Set<String> windowhandle=driver.getWindowHandles();
		System.out.println (windowhandle.size());
		for (String windows : windowhandle) {
			Thread.sleep(2000);
			driver.switchTo().window(windows );
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().contains("Mobiles")) {
				System.out.println(driver.getTitle());
				//driver.close();
				driver.findElement(By.xpath("//a[text()='Fashion']")).click();
			}
			Thread.sleep(3000);
			if(driver.getTitle().contains("Customer Service")) {
				System.out.println(driver.getTitle());
				//driver.close();
				driver.findElement(By.xpath("//h3[contains(text(),'Your Orders')]")).click();
			}
			if(driver.getTitle().contains("Books")) {
				System.out.println(driver.getTitle());
				//driver.close();
				driver.findElement(By.xpath("//a[text()='New Releases']")).click();
				
			}
			

		
		
		}

	}

}
