package com.Sauce.WebAutomation.helper.select;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {

	WebDriver driver;

	public DropDownHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void SelectByvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void SelectByindex(WebElement element, int index) {
		Select select =new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectUsingVisibleText(WebElement element, String visibleTex) {
		Select select =new Select(element);
		select.selectByVisibleText(visibleTex);
	}
	
	public void deSelectByValue(WebElement element, String value) {
		Select select =new Select(element);
		select.deselectByValue(value);
	}
	
	public void deSelectByIndex(WebElement element, int index) {
		Select select =new Select(element);
		select.deselectByIndex(index);
	}
	
	public void deSelectByvisibleTex(WebElement element, String visibleTex) {
		Select select =new Select(element);
		select.deselectByVisibleText(visibleTex);
	}
	
	public List<String> getAllDropDownData(WebElement element){
		Select select = new Select(element);
		List<WebElement> elementsList = select.getOptions();
		List<String> valueList =new LinkedList<String>();
		for(WebElement ele: elementsList) {
			valueList.add(ele.getText());
		}
		return valueList;
	}
	

}
