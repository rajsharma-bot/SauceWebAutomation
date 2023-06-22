package pageObject;

import org.openqa.selenium.WebDriver;

public class LoginObjects {

	WebDriver driver;

	public LoginObjects(WebDriver driver) {
		this.driver = driver;
	}

	public void userName(String username) {
		driver.findElement(LoginPageObject.txt_userName).sendKeys(username);
	}

	public void password(String password) {
		driver.findElement(LoginPageObject.txt_password).sendKeys(password);
	}

	public void clickLogin(WebDriver driver) {
		driver.findElement(LoginPageObject.btn_login).click();
	}

	public void login(String username, String password) {
		userName(username);
		password(password);
		clickLogin(driver);

	}

	public void LoginWithUsername(String username) {
		userName(username);
		clickLogin(driver);
	}

	public void LoginWithPassword(String password) {
		password(password);
		clickLogin(driver);
	}

	public boolean errorIsDisplayed() {
		return driver.findElement(LoginPageObject.txt_error).isDisplayed();
	}

	public boolean username_required() {
		return driver.findElement(LoginPageObject.txt_error).isDisplayed();
	}

	public boolean password_required() {
		return driver.findElement(LoginPageObject.txt_error).isDisplayed();
	}

	public boolean loginPage() {
		boolean d= driver.findElement(LoginPageObject.btn_login).isDisplayed();
		if(d==true) {
			System.out.println("Logout success");
		}else {
			System.out.println("Logout failed");
		}
		return d;
	}
}
