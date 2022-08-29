package LaunchingBrowsers;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LaunchingOpera {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
		OperaDriver driver=new OperaDriver();
	}
}
