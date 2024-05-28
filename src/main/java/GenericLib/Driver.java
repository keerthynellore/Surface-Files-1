package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;

	public static WebDriver getBrowser() {
		if (Constants.browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.browser",
					"C:\\Users\\Mahika\\eclipse-workspace\\April17thAutomation\\Drivers\\chromedriver.exe");
			// you can write system.setproperty in another way like
			// System.setProperty("webdriver.chrome.browser",system.getproperty("user.dir"),"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Constants.browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.browser",
					"C:\\Users\\Mahika\\eclipse-workspace\\April17thAutomation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Constants.browser.equalsIgnoreCase("safari")) {

			System.setProperty("webdriver.chrome.browser",
					"C:\\Users\\Mahika\\eclipse-workspace\\April17thAutomation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		return driver;

	}

}
