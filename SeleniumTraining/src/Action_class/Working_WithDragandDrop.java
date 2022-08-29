package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_WithDragandDrop {
	public static void main(String[] args) throws InterruptedException {
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

}
