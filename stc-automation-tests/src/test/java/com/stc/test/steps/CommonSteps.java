package com.stc.test.steps;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.stc.driver.manager.WebDriverManager;

public class CommonSteps {
	public static RemoteWebDriver driver;

	public CommonSteps() {
		if (driver == null) {
			try {
				driver = WebDriverManager.getDriverDynamic();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

}
