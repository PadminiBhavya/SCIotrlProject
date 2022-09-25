package TestMethods;

import org.testng.Assert;
import org.testng.annotations.*;

import Objects.OTPPageObjects;
import Utilities.ExcelUtils;

public class Tests_OTP extends BaseClass{
	
	/*@Test(priority=0, description = "Verify error message for wrong OTP")
	public void invalidOTP() throws InterruptedException
	{
		OTPPageObjects otp = new OTPPageObjects(driver);
		int otp1 = (int) ExcelUtils.getNumericData("Sheet2", 1, 0);
		int otp2 = (int) ExcelUtils.getNumericData("Sheet2", 1, 1);
		int otp3 = (int) ExcelUtils.getNumericData("Sheet2", 1, 2);
		int otp4 = (int) ExcelUtils.getNumericData("Sheet2", 1, 3);
		String otp1String = otp1+"";
		String otp2String = otp2+"";
		String otp3String = otp3+"";
		String otp4String = otp4+"";
		otp.Otp1().sendKeys(otp1String);
		Thread.sleep(2000);
		otp.Otp2().sendKeys(otp2String);
		Thread.sleep(2000);
		otp.Otp3().sendKeys(otp3String);
		Thread.sleep(2000);
		otp.Otp4().sendKeys(otp4String);
		otp.verifyButton().click();
		Assert.assertEquals("INVALID OTP", otp.verifyErrorMsg());
	
}*/
	
	@Test(priority=1, description = "Verify error message for wrong OTP")
	public void validOTP() throws InterruptedException
	{
		OTPPageObjects otp = new OTPPageObjects(driver);
		int otp1 = (int) ExcelUtils.getNumericData("Sheet2", 2, 0);
		int otp2 = (int) ExcelUtils.getNumericData("Sheet2", 2, 1);
		int otp3 = (int) ExcelUtils.getNumericData("Sheet2", 2, 2);
		int otp4 = (int) ExcelUtils.getNumericData("Sheet2", 2, 3);
		String otp1String = otp1+"";
		String otp2String = otp2+"";
		String otp3String = otp3+"";
		String otp4String = otp4+"";
		otp.Otp1().sendKeys(otp1String);
		otp.Otp2().sendKeys(otp2String);
		otp.Otp3().sendKeys(otp3String);
		otp.Otp4().sendKeys(otp4String);
		otp.verifyButton().click();
	
}
}
