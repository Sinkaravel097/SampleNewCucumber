package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.Jvm;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, strict = true, plugin = {
		"json:src\\test\\resources\\reports\\output.json", "rerun:src\\test\\resources\\failed.txt" })
public class TestRunnerClass {

	// features --> Mention the path of feature file
	// glue --> Mention the path of step definition package

	@AfterClass
	public static void generateJvmReport() {

		Jvm.generateJvm("C:\\Users\\VISHAL\\Desktop\\New\\SampleCucumber\\src\\test\\resources\\reports\\output.json");

	}

	// Group the test case
	// 1. tags = "@Sanity"
	// 2. and operator --> tags={"@Smoke" , "@Regression"}
	// 3. or operator --> tags={"@Smoke , @Regression"}
} // 4. ~@TagName --> we can exclude the tag
