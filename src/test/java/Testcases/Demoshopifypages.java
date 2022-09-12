package Testcases;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageclass.locators;
import Utilities.BaseClass;

public class Demoshopifypages extends BaseClass {

	@Test(priority = 1)
	public void Signupcheck() throws IOException, InterruptedException {

		locators Sign_page = PageFactory.initElements(driver, locators.class);
		Sign_page.signpage();

	}
//	@Test(priority = 2)
//	public void checkout() throws IOException, InterruptedException {
//
//		locators checkout_a = PageFactory.initElements(driver, locators.class);
//		checkout_a.Guestcheckout();
//
//	}
//	@Test(priority = 3)
//	public void Loginchecheckout() throws IOException, InterruptedException {
//
//		locators checkout_a = PageFactory.initElements(driver, locators.class);
//		checkout_a.Loginchecheckout();
//
//	}
	
}

