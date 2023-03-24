package org.tes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Bb {
	@Test
	private void tc10() {
		System.out.println("TestCase 10");
	}
@Test
private void tc9() {
	System.out.println("TestCase 9");
}
@BeforeClass
private void launchTheBrowser() {
	System.out.println("Launch The Browser");
}
@AfterClass
private void closeTheBrowser() {
	System.out.println("browser close");

}
}
