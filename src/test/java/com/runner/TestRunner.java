package com.runner;

import org.hexa.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"org.hexa"},monochrome=true,plugin= {"json:src\\test\\resources\\Reporting\\cucumber.json"})
public class TestRunner

{
	@AfterClass
	public static void afterClass()
	{
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\cucumber.json");
		
	}
}


