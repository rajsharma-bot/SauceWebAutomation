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

}
