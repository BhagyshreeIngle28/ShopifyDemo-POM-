package Pageclass;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.xml.xpath.XPath;

import org.apache.commons.lang.RandomStringUtils;
import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class locators extends BaseClass {

	// this class will store all the locators and methods of login page
	WebDriver driver;

	@FindBy(xpath = "/html/body/div/div[2]/div[2]/form/button[contains(text(),'Enter')]")
	WebElement Enter;

	@FindBy(id = "password")
	WebElement EnPfield;

	@FindBy(xpath = "//*[@id='login_form']/input[3]")
	WebElement ESPass;

	@FindBy(xpath = "/html/body/div[2]/sticky-header/header/div/a[1]")
	WebElement MyAccount;

	@FindBy(xpath = "//*[@id='customer_login']/a[2]")
	WebElement Createaccount;

	@FindBy(xpath = "//*[@id='create_customer']/button")
	WebElement Create;

	@FindBy(id = "RegisterForm-email")
	WebElement Email;

	@FindBy(id = "RegisterForm-password")
	WebElement Password;

	// Checkout
	@FindBy(xpath = "//*[@id=\"Banner-template--14848929005773__image_banner\"]/div[2]/div/div/a[contains(text(),'Shop all')]")
	WebElement Shopall;

	// availability
	@FindBy(xpath = "//*[@id=\"CollectionFiltersForm\"]/div[1]/details[1]/summary")
	WebElement Filter;

	// product1
	@FindBy(xpath = "//*[@id=\"main-collection-product-grid\"]/li[4]/div/a/div[2]/div/span[1]")
	WebElement Product1;

	// quantity
	@FindBy(xpath = "//*[@id=\"ProductInfo-template--14848929169613__main\"]/div[2]/quantity-input/button[2]")
	WebElement plus1;

	// Addtocart
	@FindBy(xpath = "//*[@id=\"product-form-template--14848929169613__main\"]/div/button")
	WebElement Addtocart;

	// buyitnow
	@FindBy(xpath = "//*[@id=\"product-form-template--14848929169613__main\"]/div/div/div/div/div/button[contains(text(),'Buy it now')]")
	WebElement buyitnow;

	// viewcart
	@FindBy(xpath = "/html/body/div[2]/cart-notification/div/div/div[3]/a")
	WebElement viewcart;

	// Minus1
	@FindBy(xpath = "//*[@id=\"CartItem-1\"]/td[4]/quantity-input/button[1]")
	WebElement Minusq;

	// Continue Shopping
	@FindBy(xpath = "//*[@id=\"shopify-section-template--14848928940237__cart-items\"]/cart-items/div[1]/a[@href='/collections/all']")
	WebElement Continueshop;

	// product2
	@FindBy(xpath = "//*[@id=\"main-collection-product-grid\"]/li[3]/div/a/div[2]/div/span[1]")
	WebElement Product2;

	// product Model
	@FindBy(xpath = "//*[@id=\"ProductInfo-template--14848929169613__main\"]/variant-radios/fieldset[1]/label[contains(text(),'KC-46 Pegasus')]")
	WebElement ProductModel;

	// unavailable
	@FindBy(xpath = "//*[@id=\"product-form-template--14848929169613__main\"]/div/button")
	WebElement unavailable;

	// Type
	@FindBy(xpath = "//*[@id=\"ProductInfo-template--14848929169613__main\"]/variant-radios/fieldset[2]/label[contains(text(),'Military')]")
	WebElement Type;

	// Delete product
	@FindBy(xpath = "//*[@id='Remove-1']/a")
	WebElement Deleteproduct;

	// cartcheckout
	@FindBy(xpath = "//*[@id=\"main-cart-footer\"]/div/div/div/div[2]/button[@name='checkout']")
	WebElement cartcheckout;

	// Create Account
	@FindBy(xpath = "//*[@id='customer_login']/a[@href='/account/register']")
	WebElement CreateAccount;

	// Continueshoppingdefault checkout page
	@FindBy(id = "continue_button")
	WebElement Conshopping;

	// checkbox for offers and newsletters
	@FindBy(id = "checkout_buyer_accepts_marketing")
	WebElement checkboxmarketing;

	// Lastnamecheckout
	@FindBy(id = "checkout_shipping_address_last_name")
	WebElement Lastnamec;

	// Address[Auto sugestion]
	@FindBy(id = "checkout_shipping_address_address1")
	WebElement Address;

	// discount code
	@FindBy(id = "checkout_reduction_code")
	WebElement Discountcode;

	// Apply Button
	@FindBy(id = "checkout_submit")
	WebElement Apply;

	// change / Edit the shipping details
	@FindBy(xpath = "/html/body/div/div/div/main/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/a[@class='link--small']")
	WebElement Editshippingdetails;

	// changeshipping method
	@FindBy(id = "checkout_shipping_rate_id_shopify-standard-0_00")
	WebElement standard;

	// Continue Payment
	@FindBy(id = "continue_button")
	WebElement Continuepayment;

	// completed order
	@FindBy(xpath = "//div[@class='shown-if-js']/button[@id='continue_button']")
	WebElement Completeorder;

	// -----------Login checkout ----------------

	@FindBy(xpath = "/html/body/div/div/div/header/a")
	WebElement Home;

	// my account
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
	WebElement myaccount;

	// view addresses
	@FindBy(xpath = "//*[@id='MainContent']/div/div[2]/div[2]/a")
	WebElement viewaddress;

	// Add new address
	@FindBy(xpath = "//*[@id='MainContent']/div/div/button[contains(text(),'Add a new address')]")
	WebElement Addnewaddress;

	// Addaddress
	@FindBy(xpath = "//*[@id=\"address_form_new\"]/div[12]/button[1]")
	WebElement Addaddress;

	// firstname
	@FindBy(id = "AddressFirstNameNew")
	WebElement firstname;

	// company
	@FindBy(id = "AddressCompanyNew")
	WebElement Company;

	// address
	@FindBy(id = "AddressAddress1New")
	WebElement AddressAddress1New;

	// cityaddress
	@FindBy(id = "AddressCityNew")
	WebElement AddressCityNew;

	// Phone number
	@FindBy(id = "AddressPhoneNew")
	WebElement phonenum;

	// delete
	@FindBy(xpath = "//*[@id='MainContent']/div/ul/li[1]/button[contains(text(),'Delete')]")
	WebElement delete;

	// Edit
	@FindBy(xpath = "/html/body/main/div/ul/li[2]/button[contains(text(),'Edit')]")
	WebElement Edit;

	// postal code
	@FindBy(xpath = "/html/body/main/div/ul/li[2]/div/form/div[9]/input")
	WebElement code;

	// update address
	@FindBy(xpath = "//label[contains(text(),'Set as default address')]//following::div/button[contains(text(),'Update address')]")
	WebElement updateaddress;

	// Return
	@FindBy(xpath = "//*[@id='MainContent']/div/a")
	WebElement Return;

	// catalog
	@FindBy(xpath = "//*[@id='shopify-section-header']/sticky-header/header/nav/ul/li[2]/a/span")
	WebElement catalog;

	// -------------Filter ---------------
	@FindBy(xpath = "//*[@id='CollectionFiltersForm']/div[1]/details[1]")
	WebElement Availability;

	// ava
	@FindBy(xpath = "//label[@for='Filter-Availability-1']")
	WebElement checkbox;
	
	//resetAvailability
	@FindBy(xpath = "//*[@id=\"CollectionFiltersForm\"]/div[1]/details[1]/div/div/a")
	WebElement ResetAvailability;

	// price
	@FindBy(xpath = "//*[@id=\"CollectionFiltersForm\"]/div[1]/details[2]")
	WebElement Price;

	// from price
	@FindBy(name = "filter.v.price.gte")
	WebElement Fromprice;

	//To price
	@FindBy(name = "filter.v.price.lte")
	WebElement Toprice;
	
	//3rd filter
	@FindBy(xpath = "//*[@id='CollectionFiltersForm']/div[1]/details[3]")
	WebElement Producttype;
	
	//filter2
	@FindBy(xpath = "//label[@for='Filter-Product type-2']")
	WebElement filter2;
	
	//Brand
	@FindBy(xpath = "//*[@id=\"CollectionFiltersForm\"]/div[1]/details[4]")
	WebElement brand;
	
	//filter1
	@FindBy(xpath = "//label[@for='Filter-Brand-1']")
	WebElement Filterbrand1;
	
	//Filter2brand
	@FindBy(xpath = "//label[@for='Filter-Brand-2']")
	WebElement Filterbrand2;
	
	//Resetprice
	@FindBy(xpath = "//*[@id=\"CollectionFiltersForm\"]/div[1]/details[2]/div/div/a")
	WebElement Resetprice;
	
	//Resetproducttype
	@FindBy(xpath = "//*[@id=\"CollectionFiltersForm\"]/div[1]/details[3]/div/div/a")
	WebElement Resetproducttype;
	
	//Clearall
	@FindBy(xpath = "//*[@id=\"CollectionFiltersForm\"]/div[2]/a[1]")
	WebElement Clearall;
	
	
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/form/button[contains(text(),'Enter')]")
	WebElement java;
	
	
	
	
	
	

	public locators(WebDriver driver) {

		this.driver = driver;

	}

	public void signpage() throws IOException, InterruptedException {

		// TC_1 Go to Store page !!

		
		JavascriptExecutor js61 = (JavascriptExecutor) driver;
	    js61.executeScript("arguments[0].click();", java) ;
	    
	    
	    
//		Enter.click();
//		System.out.println("click on Enter");
//		Thread.sleep(500);

		EnPfield.sendKeys("podewd");
		System.out.println("Enter  Store PAssword");
		Thread.sleep(500);

		Enter.click();
		System.out.println("click on Enter");
		Thread.sleep(500);

		EnPfield.clear();
		System.out.println("clear");
		Thread.sleep(500);

		EnPfield.sendKeys("techtic");
		System.out.println("Enter  Store PAssword");
		Thread.sleep(500);

		Enter.click();
		System.out.println("click on Enter");
		Thread.sleep(500);

//		MyAccount.click();
//		System.out.println("click on Myaccount");
//		Thread.sleep(5000);
//		Thread.sleep(5000);
//
//		Createaccount.click();
//		System.out.println("click on Createaccount");
//		Thread.sleep(5000);
//		
////		Create.click();
////		System.out.println("click on Create");
////		Thread.sleep(5000);
//		
//		Email.sendKeys("test");
//		System.out.println("Entered invalid Email id");
//		Thread.sleep(500);
//		
//		Create.click();
//		System.out.println("click on Create ");
//		Thread.sleep(5000);
//		
//		Email.sendKeys("Janny@gmail.com");
//		System.out.println("Entered  valid Email id");
//		Thread.sleep(500);
//		
//		Password.sendKeys("12");
//		System.out.println("Entered invalid Password length");
//		Thread.sleep(500);
//		
//		Create.click();
//		System.out.println("click on Create ");
//		Thread.sleep(5000);
//		
//		
//		Random randomGenerator = new Random();  
//		int randomInt = randomGenerator.nextInt(1000);  
//		Email.sendKeys("username"+ randomInt +"@gmail.com"); 
//		System.out.println("Email Entered");
//		Thread.sleep(3000);
//		
//		Password.sendKeys("Test@1234");
//		System.out.println("Entered invalid Password length");
//		Thread.sleep(500);
//		
//		Create.click();
//		System.out.println("click on Create ");
//		Thread.sleep(5000);
//		
//		MyAccount.click();
//		System.out.println("click on Myaccount");
//		Thread.sleep(5000);
//		Thread.sleep(5000);
//		
//		
	}

	public void Guestcheckout() throws IOException, InterruptedException {

		highLightElement(driver, Shopall);
		Shopall.click();
		System.out.println("Click on Shop All");
		Thread.sleep(2000);

		Select drpCountry = new Select(driver.findElement(By.id("SortBy")));
		drpCountry.selectByIndex(4);
		Thread.sleep(2000);

//		Select drpCountry1 = new Select(driver.findElement(By.id("SortBy")));
//		drpCountry1.selectByVisibleText("Price, low to high");
//		Thread.sleep(2000);
//		
//		Select drpCountry2 = new Select(driver.findElement(By.id("SortBy")));
//		drpCountry2.selectByVisibleText("Price, high to low");
//		Thread.sleep(2000);
//		
//		Select drpCountry3 = new Select(driver.findElement(By.id("SortBy")));
//		drpCountry3.selectByVisibleText("Date, new to old");
//		Thread.sleep(2000);

//		List<WebElement> Drop_down = driver
//				.findElements(By.xpath("//*[@id='CollectionFiltersForm']/div[1]/details[1]/div/ul/li[1]/label"));
//
//		for (WebElement ele : Drop_down) {
//
//			String innerHtml = ele.getAttribute("innerHTML");
//
//			if (innerHtml.contentEquals("In stock (4)")) {
//				ele.click();
//				break;
//
//			}
//			System.out.println("values from Dropdown is ========>>>>" + innerHtml);
//
//		}

		highLightElement(driver, Product1);
		Product1.click();
		System.out.println("Click on Product");
		Thread.sleep(2000);

		highLightElement(driver, plus1);
		plus1.click();
		System.out.println("Click on plus 1 quantity");
		Thread.sleep(2000);

		Addtocart.click();
		System.out.println("Click on Addtocart");
		Thread.sleep(2000);

		viewcart.click();
		System.out.println("Click on Viewcart");
		Thread.sleep(2000);

		highLightElement(driver, Minusq);
		Minusq.click();
		System.out.println("Click on Minus quantity 1");
		Thread.sleep(2000);

		Continueshop.click();
		System.out.println("Click on Continueshop");
		Thread.sleep(2000);

		highLightElement(driver, Product2);
		Product2.click();
		System.out.println("Click on Product2");
		Thread.sleep(2000);

//		ProductModel.click();
//		System.out.println("Click on Model");
//		Thread.sleep(2000);
//
//		highLightElement(driver, unavailable);
//		unavailable.click();
//		System.out.println("Click on unavailable");
//		Thread.sleep(2000);
//
//		Type.click();
//		System.out.println("Click on type");
//		Thread.sleep(2000);

		highLightElement(driver, plus1);
		plus1.click();
		System.out.println("Click on plus 1 quantity");
		Thread.sleep(2000);

		Addtocart.click();
		System.out.println("Click on Addtocart");
		Thread.sleep(2000);

		viewcart.click();
		System.out.println("Click on Viewcart");
		Thread.sleep(2000);

		highLightElement(driver, Deleteproduct);
		Deleteproduct.click();
		System.out.println("Click on Remove Product from cart");
		Thread.sleep(2000);

		cartcheckout.click();
		System.out.println("Click on cartscheckout");
		Thread.sleep(2000);

		CreateAccount.click();
		System.out.println("Click on Create account");
		Thread.sleep(2000);

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		Email.sendKeys("username" + randomInt + "@gmail.com");
		System.out.println("Email Entered");
		Thread.sleep(3000);

		Password.sendKeys("Test@1234");
		System.out.println("Entered invalid Password length");
		Thread.sleep(500);

		Create.click();
		System.out.println("click on Create ");
		Thread.sleep(5000);

		Conshopping.click();
		System.out.println("click on continue Shopping on default checkout page");
		Thread.sleep(5000);

		// Marketing Checkout

//		checkboxmarketing.click();
//		Thread.sleep(500);
//
//		String alphabet = "Johnykits";
//		String name = RandomStringUtils.random(6, alphabet);
//
//		Lastnamec.sendKeys("" + name);
//		System.out.println("Lastname Entered");
//		Thread.sleep(300);
//
//		Conshopping.click();
//		System.out.println("click on continue Shopping on default checkout page");
//		Thread.sleep(5000);
//
//		// Autosuggestion Dropdown
//		Address.sendKeys("Vastrapur");
//		Address.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1000);
//		Address.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1000);
//		Address.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(4000);
//		Address.sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//
//		// Discount code
//		Discountcode.sendKeys("test10");
//		System.out.println("Invalid Discount code is entered");
//		Thread.sleep(5000);
//
//		Apply.click();
//		System.out.println("click on Apply Discount code");
//		Thread.sleep(5000);
//
//		Discountcode.clear();
//		System.out.println("clearField ");
//
//		Discountcode.sendKeys("XMASGIFT");
//		System.out.println("Valid Discount code is entered");
//		Thread.sleep(5000);
//
//		Apply.click();
//		System.out.println("click on Apply Discount code");
//		Thread.sleep(5000);
//
//		Conshopping.click();
//		System.out.println("click on continue Shopping on default checkout page");
//		Thread.sleep(5000);
//
//		highLightElement(driver, Editshippingdetails);
//		Editshippingdetails.click();
//		System.out.println("click on editshipping");
//		Thread.sleep(5000);
//
//		// Autosuggestion Dropdown
//		Address.clear();
//		Thread.sleep(5000);
//		Address.sendKeys("Maninagar");
//		Address.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(5000);
//		Address.sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//
//		Conshopping.click();
//		System.out.println("click on continue Shopping on default checkout page");
//		Thread.sleep(5000);
//
//		standard.click();
//		System.out.println("click on Standard shipping");
//		Thread.sleep(5000);
//
//		Continuepayment.click();
//		System.out.println("click on Continue Payment");
//		Thread.sleep(5000);
//
//		Completeorder.click();
//		System.out.println("click on Complete order");
//		Thread.sleep(5000);

	}

	public void Loginchecheckout() throws IOException, InterruptedException {

		Home.click();
		System.out.println("click on Home");
		Thread.sleep(2000);

		myaccount.click();
		System.out.println("click on MyAccount");
		Thread.sleep(2000);

		viewaddress.click();
		System.out.println("click on View address");
		Thread.sleep(2000);

		Addnewaddress.click();
		System.out.println("click on add new address");
		Thread.sleep(2000);

		Addaddress.click();
		System.out.println("click on addaddress");
		Thread.sleep(2000);

		Addnewaddress.click();
		System.out.println("click on add new address");
		Thread.sleep(2000);

		firstname.sendKeys("Jack");
		System.out.println("Entered firstname");
		Thread.sleep(2000);

		Company.sendKeys("jong limited");
		System.out.println("Entered Company");
		Thread.sleep(2000);

		AddressAddress1New.sendKeys(" Street chnage");
		System.out.println(" Entered Address ");
		Thread.sleep(2000);

		AddressCityNew.sendKeys("Test");
		System.out.println("Entered city");
		Thread.sleep(2000);
		// country/region
		Select drpCountry = new Select(driver.findElement(By.id("AddressCountryNew")));

		// country/region
		Select drpCountry2 = new Select(driver.findElement(By.id("AddressProvinceNew")));

		drpCountry.selectByVisibleText("Australia");
		Thread.sleep(2000);
		drpCountry2.selectByVisibleText("Northern Territory");
		Thread.sleep(2000);

		phonenum.sendKeys("8574962356");
		System.out.println("Entered phone number");
		Thread.sleep(2000);

		Addaddress.click();
		System.out.println("click on addaddress");
		Thread.sleep(2000);

		delete.click();
		System.out.println("click on Delete");
		Thread.sleep(2000);

		// Chrome Alert
		// dismiss
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		delete.click();
		System.out.println("click on Delete");
		Thread.sleep(2000);

		// accept
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div/ul/li[2]/button[1]")));
		Edit.click();
		Thread.sleep(2000);

		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,500)", "");
//		System.out.println("click on Edit");
		Thread.sleep(2000);

		code.sendKeys("458214");
		System.out.println("Entered code");
		Thread.sleep(2000);
		Thread.sleep(3000);

//		updateaddress.click();
//		System.out.println("click on updateaddress");
//		Thread.sleep(2000);

		Thread.sleep(2000);
		Return.click();
		System.out.println("click on Return");
		Thread.sleep(2000);

		catalog.click();
		System.out.println("click on Catalog");
		Thread.sleep(2000);

		Availability.click();
		System.out.println("click on Availability");
		Thread.sleep(5000);

		checkbox.click();
		System.out.println("click on checkbox");
		Thread.sleep(5000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(5000);
		
		ResetAvailability.click();
		System.out.println("click on ResetAvailability");
		Thread.sleep(5000);

		Availability.click();
		System.out.println("click on Availability");
		Thread.sleep(5000);
		
		Price.click();
		System.out.println("click on price");
		Thread.sleep(5000);

		Fromprice.sendKeys("200");
		System.out.println("Entered the fromprice");
		Thread.sleep(5000);
		
		Toprice.sendKeys("255");
		System.out.println("Entered the Toprice");
		Thread.sleep(5000);
		
		Toprice.clear();
		System.out.println("Clear toprice");
		Thread.sleep(5000);
		
		Toprice.sendKeys("1000");
		System.out.println("Entered the Toprice");
		Thread.sleep(5000);
		
		Resetprice.click();
		System.out.println("Resetprice");
		Thread.sleep(5000);
		
		Price.click();
		System.out.println("click on price");
		Thread.sleep(5000);
		
		Producttype.click();
		System.out.println("Click on Producttype");
		Thread.sleep(5000);
		
		filter2.click();
		System.out.println("Click on Filter");
		Thread.sleep(5000);
		
		JavascriptExecutor js3= (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		
		JavascriptExecutor js4= (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(5000);
		
		Resetproducttype.click();
		System.out.println("Click on Resetproduct");
		Thread.sleep(5000);
		
		

		Producttype.click();
		System.out.println("Click on Producttype");
		Thread.sleep(5000);
		
		brand.click();
		System.out.println("Click on brand");
		Thread.sleep(5000);
		
		Filterbrand1.click();
		System.out.println("Click on firstfilter");
		Thread.sleep(5000);
		
		Availability.click();
		System.out.println("click on price");
		Thread.sleep(5000);
		
		checkbox.click();
		System.out.println("click on checkbox");
		Thread.sleep(5000);
		
		Availability.click();
		System.out.println("click on price");
		Thread.sleep(5000);
				
		Clearall.click();
		System.out.println("click on Clearall");
		Thread.sleep(5000);
		
		brand.click();
		System.out.println("Click on brand");
		Thread.sleep(5000);
		
		Filterbrand2.click();
		System.out.println("click on Filterbrand2 ");
		Thread.sleep(5000);
		
		brand.click();
		System.out.println("Click on brand");
		Thread.sleep(5000);
	
		
		
		
		
		
		
		
		
	}
	
}
