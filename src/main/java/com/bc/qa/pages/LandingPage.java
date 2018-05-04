package com.bc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bc.qa.base.BaseClass;
import com.bc.qa.util.ReusableFunctions;

public class LandingPage extends BaseClass{
	
		//ReusableFunctions rf;

		@FindBy(id = "bankrupt-agreementPrinciple_bankrupt-0")
		public WebElement confirmCheckbox;
		
		@FindBy(id="agreementPrinciple_type-of-borrower")
		public WebElement iamDropdown;
		
		@FindBy(xpath = "//a[@title='Start Now']")
		public WebElement startCta;
		
		public LandingPage()
		{
				PageFactory.initElements(driver, this);
		}
		
		public  void firstScreenTest()
		{
//				rf = new ReusableFunctions();
//				rf.checbox(confirmCheckbox);
//				rf.selectFromDropdown(iamDropdown, "F");
//				rf.clickCTA(startCta);
				
				ReusableFunctions.checbox(confirmCheckbox);
				ReusableFunctions.selectFromDropdown(iamDropdown, "F");
				ReusableFunctions.clickCTA(startCta);
			
		}
		
		
}
