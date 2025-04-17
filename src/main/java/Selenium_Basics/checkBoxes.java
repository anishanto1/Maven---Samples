package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();

		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		
		WebElement automation = driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]"));
		automation.click();
		System.out.println(automation.isEnabled());
		
	}

}
