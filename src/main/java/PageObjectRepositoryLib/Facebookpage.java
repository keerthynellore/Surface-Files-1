package PageObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import GenericLib.Constants;
import GenericLib.Driver;
import GenericLib.WebdriverCommonLib;

public class Facebookpage {
	WebDriver driver = Driver.driver;
    WebdriverCommonLib wlib = new WebdriverCommonLib();
	
	
	@FindBy(xpath = "//a[@role ='button' and @ajaxify='/reg/spotlight/']")
	private static WebElement createnewacc;
	
	@FindBy(xpath = "//input[@name ='firstname']")
	private static WebElement fname;
	
	@FindBy(name = "lastname")
	private static WebElement lname;
	
	@FindBy(name = "reg_email__")
	private static WebElement mob;
	
	@FindBy(xpath = "//input[@id='password_step_input']")
	private static WebElement pass;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement day;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "//input[@type='radio' and @value='1']")
	private static WebElement radio;
	
	@FindBy(xpath = "//button[@type='submit' and @name='websubmit']")
	private static WebElement signup;
	
	public void logintoapp() {
		
		wlib.waitforpagetoload();
		driver.get(Constants.url);
		wlib.maximize();
	}
		
		public void createacc() {
		createnewacc.click();
		fname.sendKeys("Keerthana");
		lname.sendKeys("Madhu");
		mob.sendKeys("702 345 7689");
		pass.sendKeys("@mahi456");
		Select sc = new Select(month);
		sc.selectByVisibleText("Nov");
		Select scday = new Select(day);
		scday.selectByVisibleText("13");
		Select scyear = new Select(year);
		scyear.selectByVisibleText("1983");
		radio.click();
		signup.click();
		
		
	}
	
	
	
	

}
