package ClassicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		
		String classvalue=registerlink.getAttribute("class");
		System.out.println("Class attribute "+classvalue);
		
		String linkcolor=registerlink.getCssValue("color");
		System.out.println("Color of the link "+linkcolor);
		
		String tag=registerlink.getTagName();
		System.out.println("Tag name of element "+tag);
		
		String text=registerlink.getText();
		System.out.println("text of the element "+text);
		
		if(registerlink.isEnabled())
			System.out.println("PASS : Link is enabled");
	}

}
