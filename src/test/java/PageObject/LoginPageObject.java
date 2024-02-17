package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class LoginPageObject {

	WebDriver driver;
	
	
	public LoginPageObject(WebDriver Driver) 
	{
		this.driver=Driver;
	}
	
	By usernameInput = By.id("user-name");
	By passwordInput = By.id("password");
	By Loginbutton = By.id("login-button");
	
	public void EnterUsername(String username) 
	{
		driver.findElement(usernameInput).sendKeys(username);
	}
	
	public void EnterPassword(String password) 
	{
		driver.findElement(passwordInput).sendKeys(password);
	}
		
	public void ClickLoginButton() 
	{
		driver.findElement(Loginbutton).click();
	}
	
	
	
}
