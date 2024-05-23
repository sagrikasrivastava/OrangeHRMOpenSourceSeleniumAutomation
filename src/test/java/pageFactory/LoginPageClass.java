package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class LoginPageClass extends TestBase{
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement uName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement pWord;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy (xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public WebElement fail;
	

	public void enterCredentials(String username, String password) {
		uName.sendKeys(username);
		pWord.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginBtn.click();
		    }
	
	public String getLoginFailedMessage() {
		String failMessage = fail.getText();
		System.out.println("Login Failed with Message: "+failMessage);
		return failMessage;
	}

}
