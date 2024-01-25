package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//tags = "@prod or @staging and not @bvt"
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepdefinition" }, tags = "@datatable", plugin = {
		"html:target/cucumber-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class RunCuke extends AbstractTestNGCucumberTests {

}
