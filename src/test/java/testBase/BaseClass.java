package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public Logger logger; //log4j
	
	public WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})// values comming from parameters in testng.xml
	public void setup(String br) {
		logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		default : System.out.println("invalid browser"); return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}

	public String randomString(int n) {

		String generatedString = RandomStringUtils.randomAlphabetic(n);
		return generatedString;
	}

	public String randomNumber(int n) {

		String generatedNumber = RandomStringUtils.randomNumeric(n);
		return generatedNumber;
	}

	public String AlphaNumeric(int n) {

		String generatedString = RandomStringUtils.randomAlphabetic(n);
		String generatedNumber = RandomStringUtils.randomNumeric(n);

		return (generatedString + "*$#" + generatedNumber);
	}

}
