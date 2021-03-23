package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyLoginPageLocators{
	
	@FindBy(xpath=("//*[@id='user_email']"))
	public WebElement userid;
	
	@FindBy(xpath=("//*[@id='user_password']"))
	public WebElement password;
	
	@FindBy(xpath=("//*[@type='submit']"))
	public WebElement loginButton;
	
	@FindBy(xpath=("//*[@id='radio-btn-example']/fieldset/label[2]/input"))
	public WebElement radioButton2;
	
	@FindBy(xpath=("//*[@id='autocomplete']"))
	public WebElement suggestionsTextBox;

	public WebDriver driver;
	
	
	
	  public RahulShettyLoginPageLocators(WebDriver driver) {
	  
	  this.driver=driver; PageFactory.initElements(driver,this); }
	 

}
