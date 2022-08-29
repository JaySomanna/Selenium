package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) {
		
		String Email="jays@gmail.com";
		String Password="Password";
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//"webdriver.chrome.driver" - WHICH BROWSER TO LAUNCH
		//"./driver/chromedriver.exe" - THE PATH TO THE BROWSER DRIVER
		
		WebDriver driver=new ChromeDriver(); // UPCASTING TO RESTRICT METHODS OF BROWSER OF WEBDRIVER INTERFACE
		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement login=driver.findElement(By.className("ico-login"));
		login.click();
		
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys(Email);
		
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys(Password);
		
		WebElement remember=driver.findElement(By.id("RememberMe"));
		remember.click();
		
		//WebElement forgotPassword=driver.findElement(By.className("forgot-password"));
		//forgotPassword.click();
		
		WebElement loginbutton=driver.findElement(By.className("login-button"));
		loginbutton.click();
	}

}
