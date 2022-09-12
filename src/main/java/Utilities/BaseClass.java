package Utilities;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.*;



//Testing 
public class BaseClass {
	public WebDriver driver;

	@Test
	public void setUp() {

		driver = Browserfactory.StartApplication(driver, "Chrome", "https://techtic-demo.myshopify.com/");
	
		

		System.out.println(driver.getTitle());
	}

	@BeforeTest
	public void launchbrowsers() throws InterruptedException {

		
		

	}

	// Highlight the element or message
	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: PeachPuff  ; border: 3px solid black;');",
				element);
	}

	@AfterTest
	public void tearDown() {
//
		
		//driver.close();

	}

}



