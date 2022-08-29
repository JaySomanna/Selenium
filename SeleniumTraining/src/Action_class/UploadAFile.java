package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAFile {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		
		WebElement FileUploadB = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		FileUploadB.sendKeys("E:\\PERSONAL\\Desktop\\JAYANTH_S.pdf");
	}

}
