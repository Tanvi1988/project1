package com.projectteamfortune.TestRunner;

	import cucumber.api.CucumberOptions;
	import cucumber.api.testng.AbstractTestNGCucumberTests;
	
	public class TestNGTestRunner {
		
		@CucumberOptions (
			      
			      features = {"Feature"},
			      glue = {"com.projectteamfortune.stepdefs"}
			      )
		public class TestRunner extends AbstractTestNGCucumberTests{}
		
	}