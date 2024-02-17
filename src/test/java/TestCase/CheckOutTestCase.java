package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckOutTestCase {
	
WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{	
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/"); 		
	}

	@Test
	public void Checkout1() throws InterruptedException 
	{
		LoginPageObject login = new LoginPageObject(driver);
		login.EnterUsername("standard_user");
		login.EnterPassword("secret_sauce");
	}
	
	@Test
	public void Checkout2() throws InterruptedException 
	{
		LoginPageObject login = new LoginPageObject(driver);
		login.EnterUsername("standard_user");
		login.EnterPassword("secret_sauce");
	}
	
	@Test
	public void Checkout3() throws InterruptedException 
	{
		LoginPageObject login = new LoginPageObject(driver);
		login.EnterUsername("standard_user");
		login.EnterPassword("secret_sauce");
	}
	
	@AfterMethod
	public void TearDown() 
	{		
		driver.quit();
	}

}
