package Action_class;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTestCase {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the song ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//yt-formatted-string[text()='Sign in'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sanjayneelagund@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8123423840");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		Thread.sleep(2000);
						
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys(s);
		Thread.sleep(2000);
		WebElement searchIcon=driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[3]"));
		searchIcon.click();
		
		Thread.sleep(5000);
		WebElement clickon=driver.findElement(By.xpath("//div[@id='contents']/child::ytd-video-renderer[1]"));
		clickon.click();
		
		Thread.sleep(10000);
        driver.findElement(By.xpath("//div[text()='Skip Ads']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label='No thanks']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-toggle-button-renderer'])[1]")).click();
		Thread.sleep(8000);
		driver.close();
		
	}

}
