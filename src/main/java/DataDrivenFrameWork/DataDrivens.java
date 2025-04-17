package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivens {

	String [][] data =null;

	@DataProvider(name ="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = GetExcelData();

		return data ;

	}	

	@Test
	public String[][] GetExcelData() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream("/home/anish/Documents/JXL.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		
		Sheet sheet = workbook.getSheet(0);

		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();

		String TestData[][] = new String[rowcount-1][columncount];

		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {

				TestData[i-1][j] = sheet.getCell(j,i).getContents();


			}
		}

		return TestData;
	}
	
	@Test(dataProvider ="loginData")
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

		/*
		 * 
		 * if (actualTitle.contentEquals(ExpectedURL)){
		 * System.out.println("Test Passed!"); } else {
		 * System.out.println("Test Failed"); }
		 * 
		 */

	}

}
