package testCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TC1InvalidCredentialsLoginTest extends TestBase{ 
	
	@Test
	public void loginWithInvalidCredentials() {
		
		loginPage.enterCredentials("Adm", "admin13");
		loginPage.clickLoginButton();
		st.assertEquals(loginPage.getLoginFailedMessage(), "Invalid credentials");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
