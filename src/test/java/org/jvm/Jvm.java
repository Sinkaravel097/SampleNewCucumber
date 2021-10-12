package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm {

	public static void generateJvm(String jsonFile) {

		// 1.Mention the target folder location
		File f = new File("C:\\Users\\VISHAL\\Desktop\\New\\SampleCucumber\\src\\test\\resources\\reports\\Jvm");

		// 2.Add details to the report using Configuration class
		Configuration c = new Configuration(f, "Facebook & Amazon");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Platform Version", "10");
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "92");
		c.addClassifications("Sprint No", "3");

		// 3.Add json file paths into List<String>
		List<String> l = new ArrayList<String>();
		l.add(jsonFile);

		// 4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l, c);
		// using the created object call generateReports() method.
		r.generateReports();

	}

}
