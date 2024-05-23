package testBase;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import pageFactory.AddEmployeePimSubPageClass;
import pageFactory.DashboardPageClass;
import pageFactory.DataImportPimSubPageClass;
import pageFactory.EmployeeListPimSubPageClass;
import pageFactory.LoginPageClass;
import pageFactory.PimPageClass;

public class TestBase {
	
	public static WebDriver driver;
	public static String Browser;
	public static SoftAssert st;
	public static Properties prop;
	public static WebDriverWait wait;	
	public static Actions actions;
	public static LoginPageClass loginPage;
	public static DashboardPageClass dashboardPage;
	public static PimPageClass pimPage;
	public static AddEmployeePimSubPageClass addEmpPage;
	public static EmployeeListPimSubPageClass empListPage;
	public static DataImportPimSubPageClass dataImpPage;

	
	@BeforeSuite
	public static void openBrowser() throws Throwable {

		st = new SoftAssert();

		prop = new Properties();
		prop.load(new FileReader("src\\test\\java\\config\\Global.properties"));

		Browser = prop.getProperty("browser");

		if (Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);
		initclass();
	}
	
	public static void initclass() {
		  loginPage= PageFactory.initElements(driver, LoginPageClass.class);
		  dashboardPage= PageFactory.initElements(driver, DashboardPageClass.class);
		  pimPage=PageFactory.initElements(driver, PimPageClass.class);
		  addEmpPage=PageFactory.initElements(driver, AddEmployeePimSubPageClass.class);
		  empListPage=PageFactory.initElements(driver, EmployeeListPimSubPageClass.class);
		  dataImpPage=PageFactory.initElements(driver,DataImportPimSubPageClass.class);
	}

	@AfterSuite
	public static void TearDown() {
		st.assertAll();
		driver.close();
		driver.quit();

	}

}
