package DataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BothCorrect {

	//public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

	/*
	 * @Test
	 * 
	 * @Parameters({"Username","password"})
	 */
	//public void BothCorrectMethod(String Username , String password) {
	@Test
	public void BothCorrectMethod() {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.saucedemo.com/");

		/*
		 * //Find the UserName WebElement UserName =
		 * driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		 * UserName.sendKeys(Username);
		 * 
		 * //Find The Password WebElement Password =
		 * driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 * Password.sendKeys(password);
		 * 
		 * //Click the LoginButton WebElement clickLogin =
		 * driver.findElement(By.id("login-button")); clickLogin.click();
		 */

		/*String CurrentURL =   driver.getCurrentUrl();
				System.out.println(CurrentURL);

				if (CurrentURL != "https://www.saucedemo.com/"){

					System.out.println("Logged Successfully");

				} else {

					System.out.println("Login Failed ");*/
		//}   
		
		/*
		 * login login = new login(); login.UserName(driver).sendKeys("standard_user");
		 * login.Password(driver).sendKeys("secret_sauce"); login.Click(driver);
		 */
		
		PageFactory.initElements(driver, login.class);
		
		login.UserName.sendKeys("standard_user");
		login.Password.sendKeys("secret_sauce");
		login.clicklogin.click();


	}
}

