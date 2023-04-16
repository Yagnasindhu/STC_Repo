package com.stc.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;


public class BasePage {

public RemoteWebDriver driver;
	
	public BasePage(RemoteWebDriver driver){
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}
	
	protected void clickElement(WebElement element){
		element.click();
	}

	protected String getText(WebElement element){
		return element.getText();
	}
	
}
