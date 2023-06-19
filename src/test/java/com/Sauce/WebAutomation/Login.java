package com.Sauce.WebAutomation;

import pageObject.DashboardObjects;
import pageObject.LoginObjects;

public class Login extends TestCaseBase {

	//Case to verify whether user is able to login Successfully or not
	public void verify_login_page() {

		setup();
		String product = "Swag Labs";
		LoginObjects lg = new LoginObjects(driver);
		DashboardObjects da = new DashboardObjects(driver);
		lg.login("standard_user", "secret_sauce");
		if (da.getLogoText().equals(product)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Unable to login");
		}
		teardown();

	}

	//Case to verify validation on passing incorrect username and password
	public void verify_login_error() {
		setup();
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
		teardown();
	}

	//Case to verify validation on if only username is passed
	public void usernameIsrequired() {
		setup();
		String product = "Swag Labs";
		LoginObjects lg = new LoginObjects(driver);
		lg.LoginWithUsername("abc");
		if(lg.username_required() == true) {
			System.out.println("Username is required");
		}else {
			DashboardObjects da = new DashboardObjects(driver);
			if (da.getLogoText().equals(product)) {
				System.out.println("Login Successfull");
			}
		}
		teardown();
	}
	
	////Case to verify validation if only password is passed
	public void PasswordIsrequired() {
		setup();
		String product = "Swag Labs";
		LoginObjects lg = new LoginObjects(driver);
		lg.LoginWithUsername("abc");
		if(lg.password_required() == true) {
			System.out.println("Password is required");
		}else {
			DashboardObjects da = new DashboardObjects(driver);
			if (da.getLogoText().equals(product)) {
				System.out.println("Login Successfull");
			}
		}
		teardown();
	}
	
	
	public static void main(String[] args) {
		Login l = new Login();
		
		l.verify_login_error();
		l.usernameIsrequired();
		l.PasswordIsrequired();
		l.verify_login_page();

	}
}
