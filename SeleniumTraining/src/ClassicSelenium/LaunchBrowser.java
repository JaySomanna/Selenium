package ClassicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayanth S\\eclipse-workspace\\SeleniumTraining\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}

}
