package com.bc.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.bc.qa.util.ReadingExcel;

public class BaseClass 
{
			public static WebDriver driver;
			public static FileInputStream fis;
			public static Properties prop = new Properties();
			
			public static String readProperties(String key)
			{					
						try {
							fis = new FileInputStream("C:\\javaPrograms\\BudgetCalcProject\\src\\main\\java\\com\\bc\\qa\\config\\config.properties" );
							prop.load(fis);					
						} catch (IOException e) {
							System.out.println(e.getMessage());
						}
						return prop.getProperty(key);
			} 
			
			public static Object fromExcel()
			{
					try {
						fis = new FileInputStream("C:\\javaPrograms\\BudgetCalcProject\\src\\main\\java\\com\\bc\\qa\\testdata\\TestData.xlsx");
						ReadingExcel.wb = new XSSFWorkbook(fis);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					return driver;
					
			}
			
			@BeforeClass
			public static void openBrowser()
			{
					String browserName = readProperties("browser");
					if(browserName.equals("chrome"))
					{
							driver = new ChromeDriver();							
					}else
					{
							driver = new FirefoxDriver();
					}					
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
					driver.get(readProperties("url"));
					driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			}
			
			@AfterClass
			public static void closeBrowser()
			{
					driver.quit();
			}
}
