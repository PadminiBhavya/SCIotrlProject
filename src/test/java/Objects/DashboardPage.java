package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboardTitle;
	
	@FindBy(xpath = "//img[@title='Notifications']")
	WebElement notifications;
	
	@FindBy(xpath = "//img[@src='/static/media/shuffle.812e7c7b87aff1a580a208074995dbfe.svg']")
	WebElement shuffleCustomerBtn;
	
	@FindBy(xpath ="//button[text()= ' Dashboard Tile']")
	WebElement dashboardTile;
	
	@FindBy(xpath ="//input[@placeholder='Search Dashboard Tiles']")
	WebElement searchDashboardTiles;
	
	public WebElement dashboardTitleMethod()
	{
		return dashboardTitle;
	}
	
	public WebElement notificationsMethod()
	{
		return notifications;
	}
	
	public WebElement dashboardTileMethod()
	{
		return dashboardTile;
	}
	
	public WebElement searchDashboardTileMethod()
	{
		return searchDashboardTiles;
	}
}
