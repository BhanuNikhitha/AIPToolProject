package com.bc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bc.qa.base.BaseClass;
import com.bc.qa.util.ReusableFunctions;

public class SolePersonalDetails extends BaseClass
{
			//declaring common functions lib variable	
			//ReusableFunctions spdActions;
			
			//identifying the elements on personal details screen
			@FindBy(id = "agreementPrinciple_title")
			public WebElement title;
			
			@FindBy(id = "agreementPrinciple_firstName")
			public WebElement firstName;
			
			@FindBy(id = "agreementPrinciple_lastName")
			public WebElement lastName;
			
			@FindBy(id = "agreementPrinciple_dob")
			public WebElement dateOfBirth;
			
			@FindBy(id = "agreementPrinciple_emailAddress")
			public WebElement emailId;
			
			@FindBy(xpath = "//a[@title='Next']")
			public WebElement nextCta;
			
			
			public SolePersonalDetails()
			{
				//this.driver = driver;
				//initializing the elements on personal details screen	
				PageFactory.initElements(driver, this);
			}
			
			//all actions to be performed on personal details screen
			public void solePersonalDetailsPageActions()
			{
//					spdActions = new ReusableFunctions();
//					spdActions.selectFromDropdown(title, "Miss");
//					spdActions.inputStringValue(firstName, "Ann");
//					spdActions.inputStringValue(lastName, "Heselden");
//					spdActions.inputStringValue(dateOfBirth, "01/07/1963");
//					spdActions.inputStringValue(emailId, "sdjf@jdfhj.com");
//					spdActions.clickCTA(nextCta);
				
					ReusableFunctions.selectFromDropdown(title, "Miss");
					ReusableFunctions.inputStringValue(firstName, "Ann");
					ReusableFunctions.inputStringValue(lastName, "Heselden");
					ReusableFunctions.inputStringValue(dateOfBirth, "01/07/1963");
					ReusableFunctions.inputStringValue(emailId, "sdjf@jdfhj.com");
					ReusableFunctions.clickCTA(nextCta);
					
			}
			
}
