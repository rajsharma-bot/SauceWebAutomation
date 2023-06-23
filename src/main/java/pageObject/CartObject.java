package pageObject;

import org.openqa.selenium.WebDriver;

public class CartObject {

	WebDriver driver;

	public CartObject(WebDriver driver) {
		this.driver = driver;
	}

	public String cartpage() {
		return driver.findElement(CartPageObject.pageLand).getText();
	}

	public boolean cartpageIsDispay() {
		return driver.findElement(CartPageObject.pageLand).isDisplayed();
	}

	public void continueShopping() {
		driver.findElement(CartPageObject.continueShopping).click();
	}

	public void checkOut() {
		driver.findElement(CartPageObject.btn_checkout).click();
	}

	public void firstName() {
		driver.findElement(CartPageObject.txt_Fname).sendKeys("Test fname");
	}

	public void lastName() {
		driver.findElement(CartPageObject.txt_Lname).sendKeys("Test Lname");
	}

	public void zipcode() {
		driver.findElement(CartPageObject.txt_zipcode).sendKeys("412201");
	}

	public void btncontinue() {
		driver.findElement(CartPageObject.btn_continue).click();

	}

	public void checkOutPage() {
		driver.findElement(CartPageObject.checkOutPage);
	}

	public void finishCheckout() {
		driver.findElement(CartPageObject.finishCheckout).click();
	}

	public void cancelCheckout() {
		driver.findElement(CartPageObject.CancelCheckout).click();
	}

	public boolean infoPage() {
		String info = "Checkout: Your Information";
		String fetchText = driver.findElement(CartPageObject.infoPage).getText();
		if (fetchText.equals(info)) {
			System.out.println("Successfully landed on Form page");
			return true;
		} else {
			System.out.println("Error");
		}
		return false;

	}

	public boolean CheckoutOverview() {
		String info = "Checkout: Overview";
		String fetchText = driver.findElement(CartPageObject.infoPage).getText();
		if (fetchText.equals(info)) {
			System.out.println(fetchText);
			System.out.println("Successfully landed on Form page");
			return true;
		} else {
			System.out.println("Error");
		}
		return false;

	}

	public boolean errorMessage() {
		System.out.println(driver.findElement(CartPageObject.errorPage).getText());
		return driver.findElement(CartPageObject.errorPage).isDisplayed();

	}

	public boolean thankYouPage() {
		System.out.println(driver.findElement(CartPageObject.thankYouHeader).getText());
		return driver.findElement(CartPageObject.thankYouHeader).isDisplayed();
	}

}
