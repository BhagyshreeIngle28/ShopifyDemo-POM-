package Pageclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Baseclass2;

public class test extends Baseclass2 {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"shopify-section-main-password-header\"]/div/div/password-modal/details/summary")
	WebElement pass;
	@FindBy(id = "Password")
	WebElement pass1;
	@FindBy(xpath = "//*[@id=\"login_form\"]/button")
	WebElement pass2;
	
	@FindBy(xpath = "//*[@id='shopify-section-header']/div[1]/header/details-modal/details/summary/p")
	WebElement search;

	public void login() {
		
		pass.click();
		pass1.sendKeys("gearbox");
		pass2.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", search);
	}

//	public void search1() {
//
//		
//	}

//	@FindBy(xpath = "//*[@id=\"Details-HeaderMenu-2\"]/summary/span")
//	WebElement menu;
	/*
	 * public void search() {
	 * 
	 * JavascriptExecutor js3 = (JavascriptExecutor) driver;
	 * js3.executeScript("arguments[0].click();",search) ; }
	 */
}
