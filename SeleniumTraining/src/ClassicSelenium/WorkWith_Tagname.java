package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWith_Tagname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:/Users/Jayanth%20S/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/LocatorsPractice.html");
		
		WebElement password=driver.findElement(By.tagName("input"));
		password.sendKeys("pass_sentence");
		
		WebElement radio=driver.findElement(By.tagName("input"));
		radio.click();
		
		driver.close();
	}

}
