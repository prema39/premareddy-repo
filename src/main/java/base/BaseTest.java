package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utilities.Configuration;

public class BaseTest {
	public static WebDriver driver;

	@BeforeSuite
	public static void suitesetup() {
		Configuration.loadConfiguration();
	}

	@BeforeMethod

	public static void launchBrowser() {

		String browserName = Configuration.getbrowserName().trim().toLowerCase();
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("enter valid browsename  " + browserName);

		}
		driver.manage().window().maximize();
		driver.get(Configuration.getURL());

	}

}
