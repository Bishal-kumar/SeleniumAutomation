package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RahulShettyLoginPageLocators;

public class PracticeProject2StepDef {
	public WebDriver driver;
	// RahulShettyLogin rahulShettyLogin=new RahulShettyLogin();
	RahulShettyLoginPageLocators rahulShettyLoginPageLocators;
	Logger log = Logger.getLogger(PracticeProject2StepDef.class);
	// WebDriverWait wait=new WebDriverWait(driver,20);

	@Given("^User launches \"([^\"]*)\" website$")
	public void user_launches_website(String arg1) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "/Users/bishalkumargupta/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Opening url");
		driver.get(arg1);
		rahulShettyLoginPageLocators = new RahulShettyLoginPageLocators(driver);
	}

	@When("^User enters valid userid \"([^\"]*)\" , password \"([^\"]*)\" in rahul shetty login page\\.$")
	public void user_enters_valid_userid_password_in_rahul_shetty_login_page(String arg1, String arg2)
			throws Throwable {
		try {

			log.info("Entering userid and password");

			rahulShettyLoginPageLocators.userid.sendKeys(arg1);
			rahulShettyLoginPageLocators.password.sendKeys(arg2);
		} catch (Exception e) {
			e.getCause().printStackTrace();
		}
	}

	@When("^Clicks on Signon button$")
	public void clicks_on_Signon_button() throws Throwable {

		// wait.until(ExpectedConditions.elementToBeClickable(rahulShettyLoginPageLocators.userid));
		rahulShettyLoginPageLocators.loginButton.click();
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {

		// driver.close();
	}

	@Then("^Close Selenium webdriver\\.$")
	public void close_Selenium_webdriver() throws Throwable {

		try {
			driver.close();

		} catch (Exception e) {
			e.getCause().printStackTrace();
		}
	}

	@When("^User clicks on radio button two$")
	public void user_clicks_on_radio_button_two() throws Throwable {

		try {
			rahulShettyLoginPageLocators.radioButton2.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.getCause().printStackTrace();
		}

	}

	@Then("^User has selected radion button two successfully\\.$")
	public void user_has_selected_radion_button_two_successfully() throws Throwable {

		try {
			if (rahulShettyLoginPageLocators.radioButton2.isSelected()) {
				System.out.println("Radio button 2 is selected");
			} else {
				System.out.println("Radio button 2 is not selected");
			}

		} catch (Exception e) {
			e.getCause().printStackTrace();
		}

	}

	@When("^User clicks on suggestions text box and enters text$")
	public void user_clicks_on_suggestions_text_box_and_enters_text() throws Throwable {

		try {

		} catch (Exception e) {
			e.getCause().printStackTrace();
		}
	}

	@Then("^text is entered successfully in suggestions text box$")
	public void text_is_entered_successfully_in_suggestions_text_box() throws Throwable {

		try {

		} catch (Exception e) {
			e.getCause().printStackTrace();
		}
	}

}
