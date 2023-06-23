package pageObject;

import org.openqa.selenium.By;

public class DashboardPageObject {

	public static By app_logo = By.xpath("//div[@class='app_logo']");
	public static By menu=By.xpath("//button[@id='react-burger-menu-btn']");
	public static By menuDisplay =By.xpath("//div[@class='bm-menu']");
	public static By inventory_sidebar=By.xpath("//a[@id='inventory_sidebar_link']");
	public static By about_sidebar=By.xpath("//a[@id='about_sidebar_link']");
	public static By logout_sidebar=By.xpath("//a[@id='logout_sidebar_link']");
	public static By reset_sidebar=By.xpath("//a[@id='reset_sidebar_link']"); //Not working4
	public static By aboutMe =By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-sere2z']");
	public static By item_name = By.xpath("//div[@class='inventory_item_name']");
	public static By item_desc = By.xpath("//div[@class='inventory_item_desc']");
	public static By item_price = By.xpath("//div[@class='inventory_item_price']");
	public static By btn_addCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	public static By add_item1=By.xpath("//div[@class='inventory_list']/div[1]//button");
	public static By add_item2=By.xpath("//div[@class='inventory_list']/div[2]//button");
	public static By add_item3=By.xpath("//div[@class='inventory_list']/div[3]//button");
	public static By add_item4=By.xpath("//div[@class='inventory_list']/div[4]//button");
	public static By add_item5 =By.xpath("//div[@class='inventory_list']/div[5]//button");
	public static By add_item6 =By.xpath("//div[@class='inventory_list']/div[6]//button");
	public static By btn_remove = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	public static By btn_cart= By.xpath("//a[@class='shopping_cart_link']");
	public static By cart_label= By.xpath("//span[@class='title']");
	public static By productPage =By.xpath("//span[@class='title']");
	public static By DDL =By.xpath("//select[@class='product_sort_container']");
	public static By byValue =By.xpath("//option[@value='lohi']");
	public static By lowToHigh =By.xpath("//div[@class='pricebar']//div[1]");
	
	////div[@class='pricebar']//div[1]
	

}
