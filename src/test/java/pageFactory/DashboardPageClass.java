package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class DashboardPageClass extends TestBase{
	@FindBy (xpath = "//h6[normalize-space()='Dashboard']")
	public WebElement dashboardTitle;
	
	@FindBy (xpath = "//span[normalize-space()='PIM']")
	public WebElement pimPageButton;
	
	@FindBy (xpath = "//p[@class='oxd-userdropdown-name']")
	public WebElement sidebarDropdown;
	
	@FindBy (xpath = "//ul[@class='oxd-dropdown-menu']/li[4]")
	public WebElement logoutButton;
	

	
	public String getDashboardPageTitle() {
        String dashboardTitleText = dashboardTitle.getText();
		System.out.println("Login Successful, redirected to: "+dashboardTitleText +" Page");
        return dashboardTitleText;
    } 
	
	public void openPimPage() {
		pimPageButton.click();
	}
	
	public void clickSidebarDropdown() {
		sidebarDropdown.click();
	}

	public void clickLogoutButton() {
		logoutButton.click();
	}
}
