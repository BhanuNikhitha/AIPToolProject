package com.bc.qa.testcases;

import org.testng.annotations.Test;

import com.bc.qa.base.BaseClass;
import com.bc.qa.pages.IncomePage;

public class IncomePageTest  extends BaseClass
{			
			@Test
			public static void icomePageTest() throws Exception
			{
					Thread.sleep(7000);
					IncomePage.incomeScreenTest();
			}
			
			
			
}
