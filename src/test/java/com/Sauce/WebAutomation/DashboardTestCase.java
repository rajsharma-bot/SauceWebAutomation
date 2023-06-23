package com.Sauce.WebAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Sauce.WebAutomation.helper.select.DropDownHelper;

import pageObject.CartObject;
import pageObject.DashboardObjects;
import pageObject.DashboardPageObject;
import pageObject.LoginObjects;

public class DashboardTestCase extends TestCaseBase {

	@Test(description = "Click on menu and checking whether menu is displayed or not")
	public void getMenu() {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		lg.login("standard_user", "secret_sauce");
		da.clickMenu();
		assertEquals(da.menuIsDisplayed(), true);
	}

	@Test(description = "On click about menu and getting text from about page")
	public void aboutMe() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		String cn = new Object() {
		}.getClass().getEnclosingMethod().getName();
		lg.login("standard_user", "secret_sauce");
		da.clickMenu();
		Thread.sleep(3000);
		da.aboutMe();
		assertEquals(da.aboutMeDisplayed(), true);
		System.out.println(da.aboutMeText());
		FileSaver fn = new FileSaver();
		fn.textSaver(da.aboutMeText(), cn);
	}

	@Test(description = "Adding item in cart")
	public void addToCart() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject cpo = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.AddtoCart();
		// Thread.sleep(3000);
		da.cart();
		assertEquals(cpo.cartpageIsDispay(), true, "Successfully landed on CartPage");
	}

	@Test(description = "Adding multiple item in add")
	public void addToCartMultipleIteam() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject cpo = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		// Thread.sleep(3000);
		da.cart();
		assertEquals(cpo.cartpageIsDispay(), true, "Successfully landed on CartPage");
	}

	@Test(description = "Verify whether use is able to go back to Products page ")
	public void continueShopping() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject cpo = new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.item1();
		da.item4();
		da.item6();
		// Thread.sleep(3000);
		da.cart();
		assertEquals(cpo.cartpageIsDispay(), true, "Successfully landed on CartPage");
		Thread.sleep(3000);
		cpo.continueShopping();
		assertEquals(da.productVerify(), true, "Successfully landed back to product page");

	}

	@Test(description = "Using Price low to high filer and getting ")
	public void DropDown() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		CartObject cpo = new CartObject(driver);
		DropDownHelper ddl = new DropDownHelper(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.ddByValue();
		da.lowToHigh();
		Thread.sleep(3000);
		assertEquals(da.lowToHighIsSelected(), true);
	}

}
