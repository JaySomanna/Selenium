package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextPartialLinktext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("C:/Users/Jayanth%20S/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/SampleHTMLPage.html");
		
		WebElement myntra=driver.findElement(By.linkText("myntra"));
		myntra.click();
		
		driver.navigate().back();
		
		WebElement ama=driver.findElement(By.partialLinkText("ama"));
		ama.click();	
	}
}
