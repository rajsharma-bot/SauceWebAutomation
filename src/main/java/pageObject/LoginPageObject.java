package pageObject;

import org.openqa.selenium.By;

public class LoginPageObject {

	public static By txt_userName = By.xpath("//input[@id='user-name']");
	public static By txt_password = By.xpath("//input[@id='password']");
	public static By btn_login = By.xpath("//input[@id='login-button']");
	public static By txt_error= By.cssSelector("h3[data-test='error']");

	//public static By txt_error = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");
	//public static By Password_required = By.xpath("//h3[normalize-space()='Epic sadface: Password is required']");
	//public static By username_required = By.xpath("//h3[normalize-space()='Epic sadface: Username is required']");

}
