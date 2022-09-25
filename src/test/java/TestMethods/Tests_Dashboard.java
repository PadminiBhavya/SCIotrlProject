package TestMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import Objects.DashboardPage;

public class Tests_Dashboard extends BaseClass{
	WebDriverWait wait;
	@Test(priority =0,description = "Verify that the Dashboard page is displayed after successful Login")
	public void dashboardTitle() throws InterruptedException
	{
		DashboardPage dp = new DashboardPage(driver);
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(dp.dashboardTitleMethod()));		
		Assert.assertTrue(dp.dashboardTitleMethod().isDisplayed(), "Dashboard");
		
	}
	
	@Test(priority=1, description = "Select an option in the Dashboard Tile")
	public void dashBoardTile() throws InterruptedException, AWTException
	{
		DashboardPage dp = new DashboardPage(driver);
		dp.dashboardTileMethod().click();
		dp.searchDashboardTileMethod().click();
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
	}

}
