package testNgTraining;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase01 {
	@Test
	public void elf36() {
		System.out.println("THE REASON ");
	}
	
	@Test
	public void application() {
		System.out.println("APP is good");
	}
	
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}

}
 