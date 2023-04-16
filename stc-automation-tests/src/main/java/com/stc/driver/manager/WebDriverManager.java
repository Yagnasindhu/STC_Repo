package com.stc.driver.manager;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.stc.test.config.TestConfig;

public class WebDriverManager {
	
	public static RemoteWebDriver getDriverDynamic() throws MalformedURLException {
		String defaultBrowser = TestConfig.getPropertyValue("browser");

		RemoteWebDriver driver = null;
		if (defaultBrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(defaultBrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

}
