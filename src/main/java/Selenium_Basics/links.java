package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().fullscreen();

		//Clicking Logo Button

		WebElement logoLink = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));
		logoLink.click();
	}

}