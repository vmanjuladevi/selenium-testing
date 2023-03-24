package org.tes;


import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestng extends BaseClass{
	
	@Parameters({"uesrname", "password"})
	@Test
	private void tc1(@Optional("manjuladevi61@gmail.com") String e,@Optional("manju@12")  String pass) {
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(e);
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys(pass);
		}
	@Test
	private void tc5() {
		launchurl("https://inmakes.com/");

	}
	@Test
	private void tc3() {
		launchurl("https://www.redbus.in/");
		}
	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		
	
}
	@AfterMethod
	private void EndDate() {
		Date d = new Date();
		
		
	}
@BeforeClass
private void launchTheBrowser() {
	launchbrowser();
	Windowmaximize();
	}
@AfterClass
private void closeTheBrowser() {
	System.out.println("close browser");
}
}
