package pageObject;

import org.openqa.selenium.By;

public class DashboardPageObject {

	public static By app_logo = By.xpath("//div[@class='app_logo']");
	public static By menu=By.xpath("//button[@id='react-burger-menu-btn']");
	public static By inventory_sidebar=By.xpath("//a[@id='inventory_sidebar_link']");
	public static By about_sidebar=By.xpath("//a[@id='about_sidebar_link']");
	public static By logout_sidebar=By.xpath("//a[@id='logout_sidebar_link']");
	public static By reset_sidebar=By.xpath("//a[@id='reset_sidebar_link']"); //Not working
	
	
	
	public static By item_name = By.xpath("//div[@class='inventory_item_name']");
	public static By item_desc = By.xpath("//div[@class='inventory_item_desc']");
	public static By item_price = By.xpath("//div[@class='inventory_item_price']");
	public static By btn_addCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	public static By btn_remove = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	public static By btn_cart= By.xpath("remove-sauce-labs-backpack");
	public static By cart_label= By.xpath("//span[@class='title']");

}
