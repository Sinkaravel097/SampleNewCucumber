package org.rerun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@D:\\NewMaven\\Cucumber2.30pm\\src\\test\\resources\\failed.txt" , glue="org.stepdefinition",monochrome=true)
public class TestRerunnerClass {

	
}
