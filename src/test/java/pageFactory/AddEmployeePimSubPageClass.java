package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePimSubPageClass {

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement addFirstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement addLastName;

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public WebElement createLoginDetailsToggle;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	public WebElement newUserName;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement newPassword;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement confirmPassword;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement saveButton;

	public void enterName(String firstName, String lastName) {
		addFirstName.sendKeys(firstName);
		addLastName.sendKeys(lastName);
	}

	public void enableCreateCredentialToggle() {
		createLoginDetailsToggle.click();
	}

	public void enterNewLoginDetails(String newUser, String newPass, String confirmPass) {
		newUserName.sendKeys(newUser);
		newPassword.sendKeys(newPass);
		confirmPassword.sendKeys(confirmPass);
	}

	public void saveNewEmpDetails() {
		saveButton.click();;
	}
}
