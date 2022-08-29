package testNgTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase05 {
	
	@Test
	public void launchEdge() {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	}
	
	@Test(priority = 1, groups = "smoke")
	public void honda(){
		System.out.println("Ega");
		
	}
	
	@Test(priority = 2, groups = "regression")
	public void bmw() {
		System.out.println("scrambler 650");
	}
	@Test(priority = 3, groups = "smoke")
	public void motard() {
		System.out.println("nre 950");
	}
}
