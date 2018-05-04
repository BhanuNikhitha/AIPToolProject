package com.bc.qa.testcases;

import org.testng.annotations.Test;

import com.bc.qa.base.BaseClass;
import com.bc.qa.pages.AddressDetails;
import com.bc.qa.pages.LandingPage;
import com.bc.qa.pages.SolePersonalDetails;
import com.bc.qa.util.ReusableFunctions;

public class LandingPageTest  extends BaseClass{
	
		//ReusableFunctions  rf;
		
		@Test(priority =0)
		public static void firstTest() throws Exception
		{
			LandingPage lp = new LandingPage();
			lp.firstScreenTest();
			ReusableFunctions.implictWait();
		}
			
		@Test(priority =1, dependsOnMethods ="firstTest")
		public static void secondTest()
		{
			SolePersonalDetails spd = new SolePersonalDetails();
			spd.solePersonalDetailsPageActions();
		}
		
		@Test(priority = 2, dependsOnMethods ="secondTest")
		public static void addressTest() throws Exception
		{
			AddressDetails ad = new AddressDetails();
			ad.addressPageActions();
			Thread.sleep(2000);
		}
				
}
