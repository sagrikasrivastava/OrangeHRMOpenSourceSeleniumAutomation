package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class PimPageClass extends TestBase{
	//addEmployee = //a[normalize-space()='Add Employee']
	//employeeList = //a[normalize-space()='Employee List']
	
	@FindBy (xpath = "//a[normalize-space()='Add Employee']")
	public WebElement addEmployee;
	
	@FindBy (xpath = "//li[@class='oxd-topbar-body-nav-tab --visited']")
	public WebElement employeeList;
	
	@FindBy (xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
	public WebElement  conf;
	
	@FindBy (xpath = "//a[normalize-space()='Data Import']")
	public WebElement dataImport;
	
	public void goToAddEmployee() {
		addEmployee.click();
	}
	
	public void goToEmployeeList() {
		employeeList.click();
	}
	
	public void clickOnConfig() {
		conf.click();
	}
	
	public void goToDataImp() {
		dataImport.click();
	}
}
