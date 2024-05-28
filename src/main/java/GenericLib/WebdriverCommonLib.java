package GenericLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLib {

	public static WebDriver driver = Driver.driver;
	public static WebdriverCommonLib Wlib = new WebdriverCommonLib();

	public void waitforpagetoload() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.globalwait));
	}

	public void waitforelementpresent(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.globalwait));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

	public void verifytext(String xpath, String expectedvalue) {
		Wlib.waitforpagetoload();
		WebElement element = driver.findElement(By.xpath(xpath));
		String actualtext = element.getText();

		if (expectedvalue.equalsIgnoreCase(actualtext)) {
		} else {
			System.out.println("Actual text is not matching");
			
			

		}
		
		
		}
	
	public static void switchtoalert() {
		driver.switchTo().alert();
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	}
	


