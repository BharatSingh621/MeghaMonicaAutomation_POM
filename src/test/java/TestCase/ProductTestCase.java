package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import PageObject.LoginPageObject;
import PageObject.ProductPageObject;

public class ProductTestCase {
	
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
	public void ProductTestCase1() 
	{
		LoginPageObject login = new LoginPageObject(driver);
		ProductPageObject product = new ProductPageObject(driver);
		login.EnterUsername("standard_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		product.ClickAddToCartButton1();		
		
	}
	
	@Test
	public void ProductTestCase2() 
	{
		LoginPageObject login = new LoginPageObject(driver);
		ProductPageObject product = new ProductPageObject(driver);
		login.EnterUsername("standard_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		product.ClickAddToCartButton2();
		
	}
	
	@AfterMethod
	public void TearDown() 
	{		
		driver.quit();
	}

}
