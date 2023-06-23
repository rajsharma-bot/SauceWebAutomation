package pageObject;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DashboardObjects {

	WebDriver driver;

	public DashboardObjects(WebDriver driver) {
		this.driver = driver;
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
		// return about;
	}

	public boolean aboutMeDisplayed() {
		return driver.findElement(DashboardPageObject.aboutMe).isDisplayed();

	}

	public void AddtoCart() {
		driver.findElement(DashboardPageObject.btn_addCart).click();
	}

	public void item1() {
		driver.findElement(DashboardPageObject.add_item1).click();
	}

	public void item2() {
		driver.findElement(DashboardPageObject.add_item2).click();
	}

	public void item3() {
		driver.findElement(DashboardPageObject.add_item3).click();
	}

	public void item4() {
		driver.findElement(DashboardPageObject.add_item4).click();
	}

	public void item5() {
		driver.findElement(DashboardPageObject.add_item5).click();
	}

	public void item6() {
		driver.findElement(DashboardPageObject.add_item6).click();
	}

	public void cart() {
		driver.findElement(DashboardPageObject.btn_cart).click();
	}

//	public boolean productVerify() {
//		return driver.findElement(DashboardPageObject.productPage).isDisplayed();
//	}

	public boolean productVerify() {
		boolean d = driver.findElement(DashboardPageObject.productPage).isDisplayed();
		if (d == true) {
			System.out.println("Landed back to product page");
		} else {
			System.out.println("Landed on wrong page");
		}
		return d;
	}

	public void logOut() {
		driver.findElement(DashboardPageObject.logout_sidebar).click();
	}

	public void ddByValue() {
		driver.findElement(DashboardPageObject.byValue).click();
	}

	public void lowToHigh() {
		List<WebElement> ListOfElement = driver.findElements(DashboardPageObject.lowToHigh);
		for (WebElement ele : ListOfElement) {
			System.out.println(ele.getText());
		}

	}
	
	public boolean lowToHighIsSelected() {
		return driver.findElement(DashboardPageObject.byValue).isDisplayed();
	}
}
