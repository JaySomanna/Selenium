package LaunchingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
	}

}
