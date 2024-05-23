package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class DataImportPimSubPageClass extends TestBase{
	
	@FindBy (xpath = "//div[@class='oxd-file-button']")
	public WebElement browseFile;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement uploadButton;
	
	public void clickBrowseFile() {
		browseFile.click();
	}
	
	public void clickUploadButton() {
		uploadButton.click();
	}
}
