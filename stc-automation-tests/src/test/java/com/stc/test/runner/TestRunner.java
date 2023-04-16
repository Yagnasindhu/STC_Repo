package com.stc.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/report_example.json"}, 
		//dryRun=true,
		glue = { "com.stc.test.steps" },
		features = { "classpath:TestScenarios/" }
		,monochrome=true
)
public class TestRunner {

}
