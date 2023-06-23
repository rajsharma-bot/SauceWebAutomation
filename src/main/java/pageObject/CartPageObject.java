package pageObject;

import org.openqa.selenium.By;

public class CartPageObject {
	
	public static By pageLand = By.xpath("//span[@class='title']");
	public static By continueShopping =By.xpath("//button[@id='continue-shopping']");
	public static By btn_checkout =By.xpath("//button[@id='checkout']");
	public static By infoPage= By.xpath("//span[@class='title']");
	public static By txt_Fname= By.xpath("//input[@id='first-name']");
	public static By txt_Lname= By.xpath("//input[@id='last-name']");
	public static By txt_zipcode= By.xpath("//input[@id='postal-code']");
	public static By btn_continue= By.xpath("//input[@id='continue']");
	public static By btn_cancel= By.xpath("//input[@id='cancel']");
	public static By checkOutPage= By.xpath("//span[@class='title']");
	public static By finishCheckout =By.xpath("//button[@id='finish']");
	public static By CancelCheckout =By.xpath("//button[@id='cancel']");
	public static By errorPage =By.xpath("//div[@class='error-message-container error']");
	public static By thankYouHeader =By.xpath("//h2[@class='complete-header']");
	
	
}
