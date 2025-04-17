package TestNG;

import org.testng.annotations.Test;

public class SkipTestcase {

	@Test(priority = 4 ,enabled = false)
	public void Item2() {
		System.out.println("Item 2");
	}

	@Test(priority = 2,enabled = false)
	public void Item1() {
		System.out.println("Item 1");
	}
	
	@Test(priority = 3,enabled = true)
	public void Item4() {
		System.out.println("Item 4");
	}
	@Test(priority = 1)
	public void Item3() {
		System.out.println("Item 3");
	}
	
	@Test
	public void Item() {
		System.out.println("Default");
		
	}
}

	

