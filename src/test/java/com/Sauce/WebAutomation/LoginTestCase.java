package com.Sauce.WebAutomation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.DashboardObjects;
import pageObject.LoginObjects;

public class LoginTestCase extends TestCaseBase {

	@Test(description = "Login with Valid id and password")
	public void verify_login_page() {

		String product = "Swag Labs";
//		String cn = new Object() {}.getClass().getEnclosingMethod().getName();      -- to get method name 
		LoginObjects lg = new LoginObjects(driver);
		FileSaver fn = new FileSaver();
		DashboardObjects da = new DashboardObjects(driver);
		lg.login("standard_user", "secret_sauce");
		if (da.getLogoText().equals(product)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Unable to login");
		}
	}

	@Test(description = "Verifying validation on incorret username and password")
	public void verify_login_error() {
		String product = "Swag Labs";
		LoginObjects lg = new LoginObjects(driver);
		lg.login("ABC", "admin");
		if (lg.errorIsDisplayed() == true) {
			System.out.println("Username and password do not match any user");
		} else {
			DashboardObjects da = new DashboardObjects(driver);
			if (da.getLogoText().equals(product)) {
				System.out.println("Login Successfull");
			}
		}

	}

	@Test(description = "Verify validation on if only username is passed")
	public void usernameIsrequired() {
		String product = "Swag Labs";
		LoginObjects lg = new LoginObjects(driver);
		lg.LoginWithUsername("abc");
		if (lg.username_required() == true) {
			System.out.println("Username is required");
		} else {
			DashboardObjects da = new DashboardObjects(driver);
			if (da.getLogoText().equals(product)) {
				System.out.println("Login Successfull");
			}
		}
	}

	@Test(description = "Verify validation if only password is passed")
	public void PasswordIsrequired() {

		String product = "Swag Labs";
		LoginObjects lg = new LoginObjects(driver);
		lg.LoginWithUsername("abc");
		if (lg.password_required() == true) {
			System.out.println("Password is required");
		} else {
			DashboardObjects da = new DashboardObjects(driver);
			if (da.getLogoText().equals(product)) {
				System.out.println("Login Successfull");
			}
		}

	}

	@Test(description = "Verify to check whether user is able to logout")
	public void LogOut() throws InterruptedException {
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects dc= new DashboardObjects(driver);
		lg.login("standard_user", "secret_sauce");
		dc.clickMenu();
		assertEquals(dc.menuIsDisplayed(), true);
		Thread.sleep(3000);
		dc.logOut();
		
	}
}
