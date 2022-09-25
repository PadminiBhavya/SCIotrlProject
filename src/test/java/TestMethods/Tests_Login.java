package TestMethods;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
//import Objects.BaseClass;
import Objects.LoginPage;
import Utilities.ExcelUtils;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Tests_Login extends BaseClass {

	/*@Test(priority=0,description ="Verify error message for invalid login credentials")
	public void invalidLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		String username = ExcelUtils.getStringData("Sheet1", 2, 0);
		String password = ExcelUtils.getStringData("Sheet1", 2, 1);
		lp.enterLoginCredentials(username, password);
		Assert.assertEquals("invalid mail id/password", lp.loginErrorMsg());
		Thread.sleep(10000);
		//Actions actions = new Actions(driver);
		//actions.click(lp.emailIDTextField()).pause(200).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
        //.pause(200).sendKeys(Keys.BACK_SPACE);
		lp.emailIDTextField().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		}*/
	
	@Test(priority=1,description="Verify login is successful for valid credentials")
	public void login() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(1000);
		Assert.assertTrue(lp.getInTouchLink().isDisplayed(),"Get In Touch link is displayed");
		logger.info("Get in Touch link is displayed");
		String username = ExcelUtils.getStringData("Sheet1", 1, 0);
		String password = ExcelUtils.getStringData("Sheet1", 1, 1);
		lp.enterLoginCredentials(username, password);
		//logger.info("Entered Login credentials");
	}
	
}
