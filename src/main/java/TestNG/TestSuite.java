package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite {

	    @AfterTest
		public void Item2() {
		System.out.println("Item 2");
	}

	@BeforeTest
	public void Item1() {
		System.out.println("Item 1");
	}

	@BeforeSuite
	public void Item4() {
		System.out.println("Item 4");
	}
	@Test(dependsOnMethods = "Item")
	public void Item3() {
		System.out.println("Item 3");
	}

	@Test
	public void Item() {
		System.out.println("Default");

	}
}
