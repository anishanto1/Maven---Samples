package TestNG;

import org.testng.annotations.Test;

public class DependenciesManagement {


	@Test(dependsOnMethods = "Item1")
	public void Item2() {
		System.out.println("Item 2");
	}

	@Test(dependsOnMethods = "Item3")
	public void Item1() {
		System.out.println("Item 1");
	}

	@Test(dependsOnMethods = "Item1")
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
