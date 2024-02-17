package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageObject {
	
	WebDriver driver;
	
	public ProductPageObject(WebDriver Driver) 
	{
		this.driver = Driver;
	}
	
	By addToCart1 = By.id("add-to-cart-sauce-labs-backpack");
	By addtocart2 = By.id("add-to-cart-sauce-labs-bike-light");
	
	
	public void ClickAddToCartButton1() 
	{
		driver.findElement(addToCart1).click();
	}
	
	public void ClickAddToCartButton2() 
	{
		driver.findElement(addtocart2).click();
	}

}
