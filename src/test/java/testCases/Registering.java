package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class Registering extends BaseClass {

	@Test
	public void Register() {
    	logger.info("Test case was started--------");
    	try {
		HomePage hp = new HomePage(driver);
		hp.Account();
		
		hp.Register();
		logger.info("clicked on Register link-------");
		RegisterPage Rg =new RegisterPage(driver);
		Rg.setfirstname(randomString(10).toUpperCase());
		Rg.setlastname(randomString(10).toUpperCase());
		Rg.setemail(randomString(10)+"@gmail.com");
		Rg.settelephone(randomNumber(10));
		String pass = AlphaNumeric(5);
		Rg.setpassword(pass);
		Rg.setconfirmpwd(pass);
		Rg.setagree();
		Rg.setContinue();
		logger.info("validating success meessage ---");
		String regMsg = Rg.setConfrimMsg();
		if(regMsg.equals("Your Account Has Been Created!"))
				{
			logger.info("Test Case Passed");
				}
			else
			{
				logger.error("Test Failed------");
	    		logger.debug("Debug Logs-----");
	    		Assert.assertTrue(false);
			}
		
		
    	}
    	catch(Exception e)
    	{
    		
    		Assert.fail();
    		
    	}
    	
    	logger.info("Test case Finished----------");
    	
	}

}
