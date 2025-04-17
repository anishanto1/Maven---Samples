package MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	@Test	
	public void InitiateOrdre() {

		WebDriver driver;		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.navigate().to("https://qa-mca.propmix.io/#/");

		driver.manage().window().fullscreen();



		WebElement email =	driver.findElement(By.xpath("//*[@id=\"loginemail\"]"));
		email.sendKeys("qatester1@yopmail.com");

	}
}
