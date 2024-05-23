package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class TC3PIMPageTest extends TestBase{ 
	
	@Test
	public void addNewEmployee() throws Throwable {
		loginPage.enterCredentials("Admin", "admin123");
		loginPage.clickLoginButton();
		dashboardPage.openPimPage();
		pimPage.goToAddEmployee();
		addEmpPage.enterName("Sag", "Sri");
		addEmpPage.enableCreateCredentialToggle();
		addEmpPage.enterNewLoginDetails("SagSri", "Sagsri123", "Sagsri123");
		Thread.sleep(3000);
		addEmpPage.saveNewEmpDetails();
		Thread.sleep(5000);
		st.assertEquals(empListPage.getpersonalDetailsTitle(), "Personal Details");
		dashboardPage.clickSidebarDropdown();
		Thread.sleep(2000);
		dashboardPage.clickLogoutButton();
		Thread.sleep(2000);
	}
	
	@Test
	public void searchEmployeeByName() throws InterruptedException {
		loginPage.enterCredentials("Admin", "admin123");
		loginPage.clickLoginButton();
		dashboardPage.openPimPage();
		pimPage.goToEmployeeList();
		empListPage.enterEmployeeName("Sag Sri");
		Thread.sleep(5000);
		empListPage.clickOnSearchButton();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,"+500+")");
		Thread.sleep(2000);
		empListPage.searchResultStatementText();
		st.assertNotEquals(empListPage.searchResultStatementText(), "No Records Found");
		dashboardPage.clickSidebarDropdown();
		Thread.sleep(2000);
		dashboardPage.clickLogoutButton();
		Thread.sleep(2000);
	}
	
	@Test
	public void searchEmployeeById() throws InterruptedException {
		loginPage.enterCredentials("Admin", "admin123");
		loginPage.clickLoginButton();
		dashboardPage.openPimPage();
		pimPage.goToEmployeeList();
		empListPage.enterEmployeeId("0320");
		Thread.sleep(5000);
		empListPage.clickOnSearchButton();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,"+500+")");
		Thread.sleep(2000);
		empListPage.empIdIstRow();
		st.assertEquals(empListPage.empIdIstRow(), "0320");
		dashboardPage.clickSidebarDropdown();
		Thread.sleep(2000);
		dashboardPage.clickLogoutButton();
		Thread.sleep(2000);
	}
	
//	@Test (priority=3)
//	public void importConfigurationData() throws Exception {
//		loginPage.enterCredentials("Admin", "admin123");
//		loginPage.clickLoginButton();
//		dashboardPage.openPimPage();	
//		pimPage.clickOnConfig();
//		dataImpPage.clickBrowseFile();
//		String filePath="C:\\Users\\utkarsh\\eclipse-workspace\\OrangeHRMOpenSource_Automation\\Library\\importData.csv";
//		Screen s = new Screen();
//		s.type("C:\\Users\\utkarsh\\eclipse-workspace\\OrangeHRMOpenSource_Automation\\Images\\filePathTextBox.png",filePath);
//		s.click("C:\\Users\\utkarsh\\eclipse-workspace\\OrangeHRMOpenSource_Automation\\Images\\openButton.png");
//		dataImpPage.clickUploadButton();
//		dashboardPage.clickSidebarDropdown();
//		Thread.sleep(2000);
//		dashboardPage.clickLogoutButton();
//		Thread.sleep(2000);
//	}
	
	
}
