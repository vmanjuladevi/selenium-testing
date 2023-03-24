package org.tes;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Sample9 extends BaseClass {
	@Test
	private void tc1() {
	launchurl("https://www.facebook.com/");
	Windowmaximize();
	String title = pageTitle();
    WebElement email =driver.findElement(By.id("email"));
    email.sendKeys("manjuladevi61@gmail.com");
	

}
}