package org.runnerRunnerClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue="org.stepdefinition", dryRun=false,
plugin= {"html:target","json:target/report.json"})


//plugin= {"json:src\\test\\resources\\Reports\\fb.json"})//for jvm reports...

//tags= {"~@End_To_End_Testing"})//for grouping...
//,plugin= {"html:target","json:target/report.json"})


public class TestRunnerClass {
//	@AfterClass
//	public static void reportGeneration() {
//		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\fb.json");
//	}

}
