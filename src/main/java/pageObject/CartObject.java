package pageObject;

import org.openqa.selenium.WebDriver;

public class CartObject {

	WebDriver driver;
	
	public CartObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public String cartpage() {
		return driver.findElement(CartPageObject.pageLand).getText();	}
	
	public boolean cartpageIsDispay() {
		return driver.findElement(CartPageObject.pageLand).isDisplayed();	}
	
	public void continueShopping() {
		driver.findElement(CartPageObject.continueShopping).click();
	}
}
