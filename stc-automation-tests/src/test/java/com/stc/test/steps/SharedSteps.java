package com.stc.test.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class SharedSteps extends CommonSteps {
	
	@After  
    public void embedScreenshot(Scenario scenario) { 
		if(scenario.isFailed()) {
        	System.out.println(("Scenario Failed"));
            try {  
            	byte[] bytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            	scenario.attach(bytes, "image/png", null);
            } catch (WebDriverException wde) {  
                System.err.println(wde.getMessage());  
            } catch (ClassCastException cce) {  
                cce.printStackTrace();  
            } catch (Exception e){
            	e.printStackTrace();
            }
		}
        driver.close();
        driver=null;
    }
}
