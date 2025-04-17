package TestNG;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "Nokia")
	public void Nokia() {
		System.out.println(" Nokia - Test");
	}
    
	@Test(groups = "Relliance")
	public void Relliance() {
		System.out.println(" Relliance - Test ");
	}

	@Test(groups = "Apple")
	public void Apple() {
		System.out.println(" Apple - Test ");
	}

}
