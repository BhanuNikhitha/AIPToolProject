package com.bc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bc.qa.base.BaseClass;
import com.bc.qa.util.ReusableFunctions;

public class AddressDetails extends BaseClass
{
		@FindBy(id = "agreementPrinciple_postcode")
		public WebElement postcode;
		
		@FindBy(xpath = "//button[@name='find-address']")
		public WebElement addressCta;
		
		@FindBy(xpath = "//span[@class='selecter-item first']")
		public WebElement lightbox;
		
		@FindBy(id = "agreementPrinciple_housenumber")
		public WebElement houseNum;
		
		public AddressDetails()
		{
				PageFactory.initElements(driver, this);
		}
		
		
		public void addressPageActions() throws Exception
		{
				ReusableFunctions.inputStringValue(postcode, "BA133BN");
				ReusableFunctions.clickCTA(addressCta);
				Thread.sleep(2000);
				ReusableFunctions.clickCTA(lightbox);
				ReusableFunctions.inputIntValue(houseNum, 75);
				
		}
		
	
	
	
	
}
