package org.tes;


import org.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngPriority extends BaseClass {
	@BeforeClass
	private void launchTheBrowser() {
		launchbrowser();
		Windowmaximize();
	}
	@Test(priority = -25)
	private void tc1() {
		launchurl("https://accounts.google.com/v3/signin/identifier?dsh=S-1895594437%3A1678165691186853&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfb2VJ26VRO5mPOiHaD5BuO1rsmbuglXeUTZ8q1seyr4dk7_Y1mPlY12U0Qsn7YWt3p-L4_");
		System.out.println("TestCase 1");
	}
	@Test(priority = 30)
	private void tc7() {
		launchurl("https://www.youtube.com/");
		System.out.println("TestCase 7");
	}
	@Test(priority = -10)
	private void tc2() {
		launchurl("https://www.inmakesedu.com/");
		System.out.println("TestCase 2");
	}
	@Test(priority = 20)
	private void tc6() {
		launchurl("https://www.facebook.com/");
		System.out.println("TestCase 6");

	}
	@Test(priority = -4)
	private void tc3() {
		launchurl("https://www.redbus.in/");
		System.out.println("TestCase 3");

	}
	@Test(priority = 3)
	private void tc5() {
		launchurl("https://www.amazon.in/");
		System.out.println("TestCase 5");
	}
@Test
private void tc4() {
	launchurl("https://www.flipkart.com/");
	System.out.println("TestCase 4");
}
}
