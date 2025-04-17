package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().window().fullscreen();


		//Locate Desktop
		WebElement SubMenu = driver.findElement(By.id("testingDropdown"));	
		
		Select select = new Select(SubMenu);


		//Select by Value 
		select.selectByValue("Performance");

		//Select By Index
		//select.selectByIndex(0);

		//select all the Elements 		

		//List<WebElement> list =	select.getOptions();
		//for (WebElement webElement : list) {
		//	System.out.println(webElement);
		}

		//System.out.println("The total Elemts from the Desktop Dropdown are "+ totalElement);



	}


