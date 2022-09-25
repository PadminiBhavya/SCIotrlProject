package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPPageObjects {
	
	WebDriver driver;
	public OTPPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@aria-label='Please enter verification code. Digit 1']")
	WebElement OTPSlot1;
	
	@FindBy(xpath = "//input[@aria-label='Digit 2']")
	WebElement OTPSlot2;
	
	@FindBy(xpath = "//input[@aria-label='Digit 3']")
	WebElement OTPSlot3;
	
	@FindBy(xpath = "//input[@aria-label='Digit 4']")
	WebElement OTPSlot4;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement verifyBtn;
	
	@FindBy(xpath = "//p[text()='INVALID OTP']")
	WebElement invalidOTPErrorMessage;
	
	public WebElement Otp1()
	{
		return OTPSlot1;
	}
	public WebElement Otp2()
	{
		return OTPSlot2;
	}
	public WebElement Otp3()
	{
		return OTPSlot3;
	}
	public WebElement Otp4()
	{
		return OTPSlot4;
	}
	public WebElement verifyButton()
	{
		return verifyBtn;
	}
	public WebElement verifyErrorMsg()
	{
		return invalidOTPErrorMessage;
	}
}
