package testNgTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class TestCase04 {
	
	@Test
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
	
	@Test(priority = 4)
	public void alphabet() {
		System.out.println("ENter alpha");
		
	}
	
	@Test(priority = 5, threadPoolSize = 2, invocationCount = 3)
	public void beta() {
		System.out.println("ENter beta");
		
	}
	
	@Test(priority = 1, groups = "smoke")
	public void omeg(){
		System.out.println("ENter omega");
		
	}
	
	@Test(priority = 2, groups = "regression")
	public void ducati() {
		System.out.println("scrambler");
	}
	@Test(priority = 3, groups = "smoke")
	public void hypermotard() {
		System.out.println("XRE 950");
	}
}
