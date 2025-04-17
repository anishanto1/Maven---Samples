package DataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BothWrong {

	//	public static void main(String[] args) {
	// TODO Auto-generated method stub

	@Test
	@Parameters({"Username","password"})
	public void BothWrong(String Username , String password) {


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

		/*
		 * String CurrentURL = driver.getCurrentUrl();
		 * 
		 * if (CurrentURL != "https://www.saucedemo.com/inventory.html"){
		 * 
		 * System.out.println(" Log in Failed");
		 * 
		 * } else {
		 * 
		 * System.out.println("Logged Successfully"); }
		 */

		//String newpage = driver.getTitle();

	}

}
