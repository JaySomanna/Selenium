package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		WebElement search=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[6]/div/div[2]/div[2]/div[1]/a/div/img[@alt='Fashion']"));
		search.click();
		
	}

}
