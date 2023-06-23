package com.Sauce.WebAutomation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.CartObject;
import pageObject.DashboardObjects;
import pageObject.LoginObjects;

public class CartPageTestCase extends TestCaseBase {

	@Test(description = "Verify whether landed on information page")
	public void checkoutForm() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject co = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		da.cart();
		assertEquals(co.cartpageIsDispay(), true, "Successfully landed on CartPage");
		co.checkOut();
		co.infoPage();
	}

	@Test(description = "Filling information form")
	public void FormFilling() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject co = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		da.cart();
		co.checkOut();
		co.firstName();
		co.lastName();
		co.zipcode();
		co.btncontinue();
		co.CheckoutOverview();

	}

	@Test(description = "Without passing any details in form page and click continue")
	public void validatingFormPage() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject co = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		da.cart();
		co.checkOut();
		co.btncontinue();
		assertEquals(co.errorMessage(), true);

	}

	@Test(description = "Without passing FirstName in form page and click continue")
	public void validatingwithoutFirsyName() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject co = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		da.cart();
		co.checkOut();
		co.lastName();
		co.zipcode();
		co.btncontinue();
		assertEquals(co.errorMessage(), true);

	}

	@Test(description = "Without passing lastname in form page and click continue")
	public void validatingwithoutLastName() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject co = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		da.cart();
		co.checkOut();
		co.firstName();
		co.zipcode();
		co.btncontinue();
		assertEquals(co.errorMessage(), true);

	}

	@Test(description = "Without passing Zipcode in form page and click continue")
	public void validatingwithoutZipcode() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject co = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		da.cart();
		co.checkOut();
		co.firstName();
		co.lastName();
		co.btncontinue();
		assertEquals(co.errorMessage(), true);
	}
	
	
	@Test (description = "End to end till finish Checkout")
	public void checkOut() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject co = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		da.cart();
		co.checkOut();
		co.firstName();
		co.lastName();
		co.zipcode();
		co.btncontinue();
		assertEquals(co.CheckoutOverview(), true);
		co.finishCheckout();
	
	}
}
