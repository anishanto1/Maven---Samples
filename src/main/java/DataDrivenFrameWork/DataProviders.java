package DataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {

	public void login(String Username , String password ) {
		


	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();

	driver.navigate().to("https://www.saucedemo.com/");

	//Find the UserName 
	WebElement UserName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	UserName.sendKeys(Username);

	//Find The Password
	WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	Password.sendKeys(password);

	//Click the LoginButton
	WebElement Login = driver.findElement(By.id("login-button"));
	Login.click();
}
}
