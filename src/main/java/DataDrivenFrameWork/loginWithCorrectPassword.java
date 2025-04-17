package DataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginWithCorrectPassword {

	//public static void main(String[] args) {

	@Test
	@Parameters({"Username","password"})
	public void loginWithCorrectPassword(String Username , String password) {

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

		/*String CurrentURL =   driver.getCurrentUrl();
				System.out.println(CurrentURL);

				if (CurrentURL ==  "https://www.saucedemo.com/"){

					System.out.println("Logged Successfully");

				} else {

					System.out.println("Login Failed ");*/
		//}        

	}

}

