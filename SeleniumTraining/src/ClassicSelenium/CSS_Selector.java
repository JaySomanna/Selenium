package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Jayanth%20S/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/SampleHTMLPage.html");
		
		WebElement username=driver.findElement(By.cssSelector("input[type=\"text\"]"));
		username.sendKeys("Jayanth S");
		
		WebElement pwd=driver.findElement(By.cssSelector("input[type=\"password\"]"));
		pwd.sendKeys("Password");
		
		WebElement cbox=driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
		cbox.click();
		
		WebElement radio=driver.findElement(By.cssSelector("input[value=\"submit\"]"));
		radio.click();
		
		WebElement glink=driver.findElement(By.cssSelector("a[href=\"https://www.myntra.com/\"]"));
		glink.click();
				

	}

}
