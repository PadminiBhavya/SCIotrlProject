package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder = 'Email Id']" )
	WebElement emailID;
	
	@FindBy(xpath = "//input[@placeholder = 'Password']" )
	WebElement pwd;
	
	@FindBy(xpath= "//button[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Get in Touch")
	WebElement getInTouch;
	
	@FindBy(xpath = "//p[text()='invalid mail id/password']")
	WebElement loginErrorMessage;
	
	public WebElement getInTouchLink() {
		return getInTouch;
	}
	
	public WebElement emailIDTextField()
	{
		return emailID;
	}
	
	public WebElement passwordTxtField()
	{
		return pwd;
	}
	
	public WebElement loginButton(){
		return loginBtn;
	}
	
	public WebElement loginErrorMsg() {
		return loginErrorMessage;
	}

	public void enterLoginCredentials(String email, String password)
	{
		emailID.sendKeys(email);
		pwd.sendKeys(password);
		loginBtn.click();
	}
}
