package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	

	public RegisterPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement telephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confirmpwd;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement agree;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement getConfirmMsg;

	
	public void setlastname(String lname) {

		lastname.sendKeys(lname);
	}

	public void setfirstname(String fname) {

		firstname.sendKeys(fname);
	}

	public void setemail(String mail) {

		email.sendKeys(mail);
	}

	public void settelephone(String phone) {

		telephone.sendKeys(phone);
	}

	public void setpassword(String pwd) {

		password.sendKeys(pwd);
	}

	public void setconfirmpwd(String cnfrm) {

		confirmpwd.sendKeys(cnfrm);
	}

	public void setagree() {

		agree.click();
	}

	public void setContinue() {

		Continue.click();
	}

	public String setConfrimMsg() {
		try {
			return (getConfirmMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}

}
