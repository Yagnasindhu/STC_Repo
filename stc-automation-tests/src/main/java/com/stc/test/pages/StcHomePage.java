package com.stc.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

import com.stc.test.config.TestConfig;

public class StcHomePage extends BasePage{
	
private RemoteWebDriver driver;
	

	@FindBy(id="country-name")
    private WebElement labelCountryName;

	@FindBy(css = "#bh-contry-flag > img")
    private WebElement imageLabelCountryBahrain;
	
	@FindBy(css = "#sa-contry-flag > img")
    private WebElement imageLabelCountryKSA;
	
	@FindBy(css = "#kw-contry-flag > img")
    private WebElement imageLabelCountryKuwait;
	
	@FindBy(id = "currency-lite")
    private WebElement labelCurrencyLite;
	
	@FindBy(id = "currency-classic")
    private WebElement labelCurrencyClassic;
	
	@FindBy(id = "currency-premium")
    private WebElement labelCurrencyPremium;
	
	

	public StcHomePage(RemoteWebDriver driver) {
		super(driver);
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}
	
	public void gotoHomePage() {
		driver.get(TestConfig.getPropertyValue("env.url"));
	}

	public void selectCountry(String countryName) {
		clickElement(labelCountryName);
		if(countryName.equalsIgnoreCase("Bahrain")) {
			clickElement(imageLabelCountryBahrain);
		}
		else if(countryName.equalsIgnoreCase("KSA")) {
			clickElement(imageLabelCountryKSA);
		}
		else if(countryName.equalsIgnoreCase("Kuwait")) {
			clickElement(imageLabelCountryKuwait);
		}
	}

	public String getCurrencyValue(String type) {
		
		String currencyText = null;
				
		if(type.equalsIgnoreCase("lite")) {
			currencyText= getText(labelCurrencyLite);
		}
		else if(type.equalsIgnoreCase("classic")) {
			currencyText= getText(labelCurrencyClassic);
		}
		else if(type.equalsIgnoreCase("premium")) {
			currencyText= getText(labelCurrencyPremium);
		}
		return currencyText;
	}
}
