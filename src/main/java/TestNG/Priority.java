package TestNG;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 4)
	public void Item2() {
		System.out.println("Item 2");
	}

	@Test(priority = 2)
	public void Item1() {
		System.out.println("Item 1");
	}
	
	@Test(priority = 3)
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
