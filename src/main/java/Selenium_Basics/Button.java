package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");

		//Click the Cart Button 

		WebElement CartButton = driver.findElement(By.id("cart-total"));
		CartButton.isEnabled();

		//Check whether the Button is in Enabled mode or not ?

		if (CartButton.isEnabled()) {
			System.out.println("Cart Button is Enabled ");
		}
		else {
			System.out.println("Cart Button is Enabled");
		}

		//Click the cart Button	
		CartButton.click();

		System.out.println(CartButton.getText());	

		if (CartButton.isSelected()) {

			System.out.println("Car Button is selected ");
		}
		else {
			System.out.println("Car Button not selected ");
		} 

	}

}




