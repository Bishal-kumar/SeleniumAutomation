package stepDefinations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{

	
	@BeforeMethod
	@Before("@MobileTest")
	public void beforevaldiation()
	{
		System.out.println("Before Mobile  hook");
	}
	
	@AfterMethod
	@After("@SmokeTest")
	public void Aftervaldiation()
	{
		driver.close();
	}
	@AfterMethod
	@After("@RegressionTest")
	public void AfterSeleniumTest()
	{
		driver.close();
	}
		
		@BeforeMethod
		@Before("@WebTest")
		public void beforeWebvaldiation()
		{
			System.out.println("Before Web  hook");
		}
		
		@AfterMethod
		@After("@WebTest")
		public void AfterWebvaldiation()
		{
			System.out.println("  After Web before hook");
		}
	}

