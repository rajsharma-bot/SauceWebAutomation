package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardObjects {

	WebDriver driver;
	
	public DashboardObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLogoText() {
		return driver.findElement(DashboardPageObject.app_logo).getText();
	}
	
	public void clickMenu() {
		
		driver.findElement(DashboardPageObject.menu).click();
	}
	
	public boolean menuIsDisplayed() {
		return driver.findElement(DashboardPageObject.menuDisplay).isDisplayed();
	}
	
	public void aboutMe() {
		driver.findElement(DashboardPageObject.about_sidebar).click();
	}
	
	public String aboutMeText() {
		return driver.findElement(DashboardPageObject.aboutMe).getText();
		//return about;
	}
	
	public boolean aboutMeDisplayed() {
		return driver.findElement(DashboardPageObject.aboutMe).isDisplayed();
		
	}
	
	public void AddtoCart() {
		driver.findElement(DashboardPageObject.btn_addCart).click();
	}
	
	public void cart() {
		driver.findElement(DashboardPageObject.btn_cart).click();
	}
	
//	public int addToCart_2() {
//		List<WebElement> elements =driver.findElements(DashboardPageObject.btn_addCart);
//		return elements.size();
//	
//	}
	
	
	
	
}
