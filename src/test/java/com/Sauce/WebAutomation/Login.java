package com.Sauce.WebAutomation;

import pageObject.LoginObjects;


public class Login extends TestCaseBase {

		// standard_user

		// secret_sauce

		public void verify_login_page() {

			setup();
			LoginObjects lg = new LoginObjects(driver);
			lg.login( "standard_user", "secret_sauce");
			teardown();
		}

		public static void main(String[] args) {
			Login l = new Login();
			l.verify_login_page();
		}
	}

