package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	String name = "Test";

	@Test
	public void NameCheck() {
		
		Assert.assertEquals(name, "Test"); 
	
	}
}
