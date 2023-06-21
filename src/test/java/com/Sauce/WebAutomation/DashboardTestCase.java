package com.Sauce.WebAutomation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.CartObject;
import pageObject.DashboardObjects;
import pageObject.LoginObjects;

public class DashboardTestCase extends TestCaseBase {

	@Test (description = "Click on menu and checking whether menu is displayed or not")
	public void getMenu() {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da=new DashboardObjects(driver);
		lg.login("standard_user", "secret_sauce");
		da.clickMenu();
		assertEquals(da.menuIsDisplayed(), true);
	}
	
	@Test(description = "On click about menu and getting text from about page")
	public void aboutMe() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da=new DashboardObjects(driver);
		String cn = new Object() {}.getClass().getEnclosingMethod().getName();
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
		DashboardObjects da=new DashboardObjects(driver);
		CartObject cpo=new CartObject(driver);
		lg.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		da.AddtoCart();
		//Thread.sleep(3000);
		da.cart();
		assertEquals(cpo.cartpageIsDispay(), true, "Successfully landed on CartPage");
	}
}
