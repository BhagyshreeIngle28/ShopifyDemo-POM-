package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	static String driverPath = "./driver/chromedriver.exe";

	public static WebDriver StartApplication(WebDriver driver, String BrowserName, String appURL) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}
		else
		if (BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("not support");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		driver.close();
	}

}
