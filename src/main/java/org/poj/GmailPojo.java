package org.poj;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass {
	public GmailPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "identifierId")
	private WebElement email;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nxtBtn;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwd;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement passWdNxtBtn;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNxtBtn() {
		return nxtBtn;
	}
	public WebElement getPasswd() {
		return passwd;
	}
	public WebElement getPassWdNxtBtn() {
		return passWdNxtBtn;
	}
	
	
	
}
