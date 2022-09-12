package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BM {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://45.79.111.106/bm-admin/#/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/app-auth/app-login/div/div/div[2]/div/form/div[1]/input")).click();
		driver.findElement(By.name("email")).sendKeys("administrator@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/app/app-auth/app-login/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		System.out.println("Login successfully");
		driver.findElement(By.xpath("/html/body/app/app-layout/app-sidebar/aside/div/nav/ul/li/a[4]")).click();
		driver.findElement(By.xpath("/html/body/app/app-layout/app-sidebar/aside/div/nav/ul/li/ul/li/a[1]/p")).click();
		System.out.println("Click Kid training page");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app/app-layout/div/div/app-list/div/section/div/div/div[2]/button"))
				.click();
		System.out.println("Click on add training button");
		Thread.sleep(3000);
		
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[1]/input"))
				.sendKeys("NewKiddA&");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[2]/input"))
				.sendKeys("Description");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[3]/input"))
				.sendKeys("Note");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[4]/input"))
				.sendKeys("Goal");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[5]/input"))
				.sendKeys("Loream text");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[6]/input"))
				.sendKeys("response");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[7]/input"))
				.sendKeys("Example");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[8]/input"))
				.sendKeys("Mistery Criteria");
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[9]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[9]/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[9]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[10]/button"))
				.click();
		driver.findElement(By.name("current_item")).sendKeys("Current Item 1");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[10]/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[10]/div[2]/table/p/tbody/tr/td[1]/input"))
				.sendKeys("Current item 2");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[11]/input"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[12]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[12]/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[12]/ng-multiselect-dropdown/div/div[1]/span/span[3]/span"))
				.click();
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[13]/input"))
				.sendKeys("3");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[14]/input"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[15]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[15]/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[15]/ng-multiselect-dropdown/div/div[1]/span/span[3]/span"))
				.click();
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[16]/input"))
				.sendKeys("3");
		driver.findElement(By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[2]/button"))
				.click();
		System.out.println("Kid training added successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-list/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[3]/button[1]/i"))
				.click();
		System.out.println("Kid training preview successfully");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/app/app-layout/app-navbar/nav/ul[1]/app-ng-dynamic-breadcrumb/ul/span[1]/li/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-list/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[3]/button[2]/i"))
				.click();
		Thread.sleep(3000);
		// WebElement driver6 =
		// driver.findElement(By.xpath("/html/body/app/app-layout/div/div[1]/app-list/div/div/div/div/div/div[2]/table/tbody/tr[12]/td[3]/button[2]"));
		// JavascriptExecutor js1 = (JavascriptExecutor) driver;
		// js1.executeScript("arguments[0].click();", driver6) ;
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-edit/div/div/div/div/div/form/div[1]/div[12]/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-edit/div/div/div/div/div/form/div[2]/button")).click();
		System.out.println("Kid training updated successfully");
		driver.findElement(By.xpath("/html/body/app/app-layout/app-sidebar/aside/div/nav/ul/li/a[3]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/app/app-layout/div/div/app-list/div/section/div/div/div[2]/button"))
				.click();

		Thread.sleep(2000);

		// drop-down1

		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[1]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[1]/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[1]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();

		// drop-down2

		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[2]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[2]/ng-multiselect-dropdown/div/div[1]/span/span[2]/span"))
				.click();

		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[3]/input"))
				.sendKeys("NewKid");
		driver.findElement(
				By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[1]/div[4]/input"))
				.sendKeys("NewParent");
		driver.findElement(By.xpath("/html/body/app/app-layout/div/div/app-add/div/div/div/div/div/form/div[2]/button"))
				.click();
		System.out.println("Manage kid added successfully");
	}
}
