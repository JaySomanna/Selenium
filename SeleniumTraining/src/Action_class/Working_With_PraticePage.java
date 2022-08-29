package Action_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_PraticePage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		for(int i=1;i<=3;i++) {
		driver.findElement(By.xpath("//input[@value='radio"+i+"']")).click();
	     }
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("abcd");
		WebElement options=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s1=new Select(options);
		
		
		List<WebElement> l1=s1.getOptions();
		for(int i=0;i<l1.size();i++) {
			l1.get(i).click();
		}
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//input[@value='option"+i+"']")).click();
		}
		Thread.sleep(2000);
		
		
	}
	
	

}
