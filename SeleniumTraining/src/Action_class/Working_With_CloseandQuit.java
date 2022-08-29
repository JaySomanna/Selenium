package Action_class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_CloseandQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Admin/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/MultipleWindow.html");

		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		Set<String> windowhandle=driver.getWindowHandles();
		System.out.println (windowhandle.size());
		for (String windows : windowhandle) {
			
			driver.switchTo().window(windows);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);

			if(driver.getTitle().contains("barbeque")) {
				System.out.println(driver.getTitle());
				driver.close();
			}
		}	
	}

}
