package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class EmployeeListPimSubPageClass extends TestBase{
	
	//employeeName = (//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1] -- Index_xpath
	//searchButton = //button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']
	//searchResultStatement = (//span[@class='oxd-text oxd-text--span'])[1]
	
	@FindBy (xpath = "//h6[normalize-space()='Personal Details']")
	public WebElement personalDetailsTitle;
	
	@FindBy (xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
	public WebElement employeeName;
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement employeeId;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement searchButton;
	
	@FindBy (xpath = "(//span[@class='oxd-text oxd-text--span'])[1]")
	public WebElement searchResultStatement;
	
	// xpath of id cell of 1st in the record table after clicking on search button
	@FindBy (xpath = "((//div[@role='row'])[2]/div[@role='cell'])[2]")
	public WebElement firstRowIdCell;
	
	public String getpersonalDetailsTitle() {
		String personalDetText=personalDetailsTitle.getText();
		System.out.println("New Employee Created and page reverted to Employee List "+personalDetText);
		return personalDetText;
	}
	
	public void enterEmployeeName(String empName) {
		employeeName.sendKeys(empName);
	}
	
	public void enterEmployeeId(String empid) {
		employeeId.sendKeys(empid);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public String searchResultStatementText() {
		String resultStatementText = searchResultStatement.getText();
		System.out.println(resultStatementText);
		return resultStatementText;
	}
	
	public String empIdIstRow() {
		String empIDretrieved = firstRowIdCell.getText();
		System.out.println(empIDretrieved);
		return empIDretrieved;
	}
}
