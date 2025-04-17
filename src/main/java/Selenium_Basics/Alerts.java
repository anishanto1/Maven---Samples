package Selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();

		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement alertElement = driver.findElement(By.xpath("//*[@name='alert']"));
		alertElement.click();

		//Initializing Alert Interface
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		WebElement Prompt = driver.findElement(By.xpath("//*[@name='prompt']"));
		Prompt.click();

		//Initializing Alert Interface
		
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.sendKeys("Tester");
		PromptAlert.accept();
		

	}

}
