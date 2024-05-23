package testCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TC2ValidCredentialsLoginTest extends TestBase{ 
	
	@Test
	public void loginWithValidCredentials() {
		
		loginPage.enterCredentials("Admin", "admin123");
		loginPage.clickLoginButton();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		st.assertEquals(dashboardPage.getDashboardPageTitle(), "Dashboard");
		dashboardPage.clickSidebarDropdown();
		dashboardPage.clickLogoutButton();
		
	}
	
}
