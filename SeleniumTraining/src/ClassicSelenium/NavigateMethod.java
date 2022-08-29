package ClassicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.navigate().refresh();
		driver.get("https://open.spotify.com/search");
		driver.navigate().back();
		driver.navigate().forward()	;	
		driver.navigate().to("http://demowebshop.tricentis.com/");
		
		String URL=driver.getCurrentUrl();
		if(URL.contains("tricentis"));
		System.out.println("Pass");
		System.out.println(URL);
	}

}
