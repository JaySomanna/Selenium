package testNgTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase03 {
	@Test
	public void actionClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		String s[]= {"box101","box102","box103","box104","box105","box6","box107"};
		Actions act=new Actions(driver);
		for (int i = 0; i < s.length; i++) {
			act.dragAndDrop(driver.findElement(By.id("box"+(i+1))), driver.findElement(By.id("box10"+(i+1)))).build().perform();
			Thread.sleep(200);
		}
		driver.close();
	}

	@Test
	public void rightClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Right click
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		Thread.sleep(2000);

		driver.close();
	}
}
