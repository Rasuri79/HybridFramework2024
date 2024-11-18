package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement LinkAccount;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")
	WebElement LinkRegister;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a")
	WebElement Login;

	public void Account() {

		LinkAccount.click();;
	}

	public void Register() {

		LinkRegister.click();;
	}

	public void Login() {

		Login.click();
	}

}
