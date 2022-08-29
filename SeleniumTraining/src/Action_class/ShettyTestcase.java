package Action_class;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShettyTestcase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> window=driver.getWindowHandles();
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();

		for (String reg : window) {
			driver.switchTo().window(reg);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("QA Click Academy")) {
				Thread.sleep(15000);
				driver.findElement(By.xpath("//span[text()='Register']")).click();
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jayanth s"); 
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jays@gmail.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SAYNOTHING");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.close();
			
			}
		
		}
		driver.switchTo().window(parentWindow);
		
		
		Set<String> window1=driver.getWindowHandles();
		for (String log : window1) {
			if(driver.getTitle().contains("Rahul Shetty Academy")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Login']")).click();

				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jays@gmail.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SAYNOTHING");
		
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.close();
			}


		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Somanna");
		driver.findElement(By.id("alertbtn")).click();
		Alert a=driver.switchTo().alert();
		if(a.getText().contains("Somanna")) {
			Thread.sleep(2000);
			a.accept();
			System.out.println("PASS:Alert popup is handled");
		}else {
			System.out.println("FAIL:Alert popup is not handled");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Jays");
		driver.findElement(By.id("confirmbtn")).click();
		if(a.getText().contains("Jays")) {
			Thread.sleep(2000);
			a.dismiss();
			System.out.println("PASS:Confirmation popup is handled");
		}else {
			System.out.println("FAIL:Confirmation popup is not handled");
		}
		Thread.sleep(3000);
		driver.quit();
	}



}
