package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.RahulShettyLoginPageLocators;

public class RahulShettyLogin {
	WebDriver driver;
	RahulShettyLoginPageLocators rahulShettyLoginPageLocators;
	public RahulShettyLogin() {
		rahulShettyLoginPageLocators=new RahulShettyLoginPageLocators(driver);
	}
	public void EnterCreds(String userid,String password)
	{
		
		rahulShettyLoginPageLocators.userid.sendKeys(userid);
		rahulShettyLoginPageLocators.userid.sendKeys(password);
		rahulShettyLoginPageLocators.loginButton.click();
	}
}
