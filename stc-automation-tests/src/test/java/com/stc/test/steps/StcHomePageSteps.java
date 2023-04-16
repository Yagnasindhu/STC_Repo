package com.stc.test.steps;

import com.stc.test.pages.StcHomePage;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class StcHomePageSteps extends CommonSteps {

	public StcHomePage stcHomePage;
	
	public StcHomePageSteps(){
		stcHomePage = new StcHomePage(driver);
	}
	
	@Given("I am on STC TV subscription home page")
	public void i_am_on_stc_tv_subscription_home_page() {
		stcHomePage.gotoHomePage();
	}
	@When("I select country as {string}")
	public void i_select_country_as(String countryName) {
		stcHomePage.selectCountry(countryName);	
	}
	
	@Then("I should see the plan details for the type {string} price and currency as {string}")
	public void i_should_see_the_plan_details_for_the_type_price_and_currency_as(String type, String currency) {
		String currencyValue = stcHomePage.getCurrencyValue(type);
		assertEquals(currency, currencyValue);
	}

}
