package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageclass.test;
import Utilities.Baseclass2;

public class test12 extends Baseclass2 {

	@Test(priority = 1)
	public void LoginWeb() throws InterruptedException {
		test login1 = PageFactory.initElements(driver, test.class);
		login1.login();
	}

//	@Test(priority = 2)
//	public void SearchProduct() throws InterruptedException {
//		test searchpro = PageFactory.initElements(driver, test.class);
//		searchpro.search1();
//
//	}
}