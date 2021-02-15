package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String json) {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		Configuration con=new Configuration(f, "Facebook app");
		con.addClassifications("Platform name", "windows");
		con.addClassifications("Platform version", "10");
		con.addClassifications("Browser name", "Chrome");
		con.addClassifications("Browser version", "87.0");
		con.addClassifications("Sprint no", "21");
		List<String> l=new ArrayList<String>();
		l.add(json);
		ReportBuilder r=new ReportBuilder(l, con);
		r.generateReports();

	}

}
