package pageObject;

import org.openqa.selenium.WebDriver;

public class DashboardObjects {

	WebDriver driver;
	
	public DashboardObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLogoText() {
		return driver.findElement(DashboardPageObject.app_logo).getText();
	}
	
	
	
}
