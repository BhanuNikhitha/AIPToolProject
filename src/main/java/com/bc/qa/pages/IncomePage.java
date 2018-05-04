package com.bc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bc.qa.base.BaseClass;
import com.bc.qa.util.ReusableFunctions;

public class IncomePage extends BaseClass {
	
		@FindBy(className = "btn-calculate")
		public static WebElement startCTA;
	
		@FindBy(xpath = "//div[@class='bcal-sl-input']")
		public static WebElement income;
		
		@FindBy(id = "new_form_income_yourincome")
		public static  WebElement incFreq;
		
		@FindBy(xpath = "//a[@class='next']")
		public static WebElement nextCta;
	
			
		public IncomePage()
		{
				PageFactory.initElements(driver, this);
		}
		
		
		public static void incomeScreenTest()
		{
				ReusableFunctions.clickCTA(startCTA);
				ReusableFunctions.inputIntValue(income, 55);
				ReusableFunctions.selectFromDropdown(incFreq, "month");
				ReusableFunctions.clickCTA(nextCta);
		}


		

}
