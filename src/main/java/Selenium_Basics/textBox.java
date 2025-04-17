package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().fullscreen();

		//Selecting Text Box & send Keys

		WebElement textbox = driver.findElement(By.name("search"));

		//Providing Send Keys 
		textbox.sendKeys("Mobile");

		//Initiating search by Keys
		textbox.sendKeys(Keys.ENTER);
		


	}

}
