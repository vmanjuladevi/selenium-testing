package org.tem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleMethod {
	@Test
	private void tc1() {
		System.out.println("Tc1:" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement hello = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		hello.click();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("9629733310");
		WebElement okBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		okBtn.click();
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345");
		WebElement signBtn = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		signBtn.click();
	}
	@Test
	private void tc3() {
		System.out.println("Tc3:" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	@Test
	private void tc2() {
		System.out.println("Tc2:" + Thread.currentThread().getId());
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();

	}
}