package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginwithoutFindBy {
	
	public static WebElement username;
	public static  WebElement password;
	public static WebElement clickLogin;

@Test
	public void Login() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.saucedemo.com/");
		
		PageFactory.initElements(driver, loginwithoutFindBy.class);

		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		clickLogin.click();

	}
}
