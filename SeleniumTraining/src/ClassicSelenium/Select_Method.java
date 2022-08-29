package ClassicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("C:/Users/Jayanth%20S/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		
		WebElement Dropdown=driver.findElement(By.id("standard_cars"));
		Select sel=new Select(Dropdown);
		
		List<WebElement> options=sel.getOptions();
		
		for(int i=0;i<12;i++) {
		//sel.selectByIndex(i);
		options.get(i).click();
		Thread.sleep(2000);
		
		
		}
	}
	

}
