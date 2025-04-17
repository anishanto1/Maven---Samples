package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {

@FindBy(how = How.XPATH,using ="//*[@id=\"user-name\"]")
public static WebElement UserName;

@FindBy(xpath = "//*[@id=\"password\"]")
public static WebElement Password;

@FindBy(how = How.ID,using = "login-button")
public static WebElement clicklogin;


	
	/*public static WebElement UserName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"user-name\"]"));

	}

	public static WebElement Password(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"password\"]"));

	}

	public static WebElement Click(WebDriver driver) {
		return driver.findElement(By.id("login-button"));
*/
	

}
