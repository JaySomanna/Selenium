package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_withDisselectDD {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
			driver.findElement(By.xpath("//select[@id='products-orderby']")).click();
			driver.findElement(By.xpath("//select[@id='']")).click();
	}

}
