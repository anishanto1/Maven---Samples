package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();

		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		
		WebElement CheckBoxMale = driver.findElement(By.id("male"));
		CheckBoxMale.click();
		 System.out.println(CheckBoxMale.isSelected());
	}

}
