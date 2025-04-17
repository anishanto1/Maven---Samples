package AdvancedConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();

		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");

		//Click the Button 
		WebElement Button1 = driver.findElement(By.id("newWindowBtn"));
		Button1.click();

		//window Handle - Current Window 
		String OpenNewWindow = driver.getWindowHandle();

		//switching control to newly Opend window

		Set<String>	handlesdriver = driver.getWindowHandles();

		for (String newWindow : handlesdriver) {
			driver.switchTo().window(newWindow);
		}
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Test");
		driver.close();

	}

}
