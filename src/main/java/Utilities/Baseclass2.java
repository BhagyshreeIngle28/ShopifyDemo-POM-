package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Baseclass2 {
	public WebDriver driver;

	@Test
	public void main() {
		// set the edge Driver path
		driver = Browserfactory.StartApplication(driver, "Chrome", "https://gearbox-sports.myshopify.com/");
		// launching the specified URL
		// driver.get("https://gearbox-sports.myshopify.com/");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
}
