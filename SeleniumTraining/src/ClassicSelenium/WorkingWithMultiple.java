package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultiple {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Jayanth%20S/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/MultipleDropdown.html");
			
			WebElement fooddd=driver.findElement(By.name("menu"));
			
			Select sel=new Select(fooddd);
			
			if(sel.isMultiple()) {
				System.out.println("Drop down is multiple");
			}
			
			else {
				System.out.println("Drop down is multiple");
			}
			
			sel.selectByValue("item 1");
			sel.selectByValue("item 2");
			sel.selectByValue("item 3");
			
	}

}
