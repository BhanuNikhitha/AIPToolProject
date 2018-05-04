package com.bc.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bc.qa.base.BaseClass;

public class ReusableFunctions extends BaseClass {
	
		//implicit wait	
		public static void implictWait()
		{
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		}
		
		//Inputting integer value
		public static void inputIntValue(WebElement inputField, int value)
		{	
			inputField.sendKeys(new Integer(value).toString());
		}
		
		//inputting string value
		public static void inputStringValue(WebElement inputField, String value)
		{	
			inputField.sendKeys(value);
		}
		
		//click the CTA
		public static void clickCTA(WebElement ctaLocator)
		{
				if(ctaLocator.isEnabled())
				{
						ctaLocator.click();
				}
				else
				{
						System.out.println(ctaLocator+" is not enabled");
				}
		}
		
		
		//Select a value from drop down
		public static void selectFromDropdown(WebElement dropdown, String value )
		{
				Select option = new Select(dropdown);
				option.selectByValue(value);
		}
		
		//check the check box
		public static void checbox(WebElement locator)
		{
				locator.click();
		}
		
		//Clear the input field value
		public static void clearValue(WebElement locator)
		{
			locator.clear();
		}

}
