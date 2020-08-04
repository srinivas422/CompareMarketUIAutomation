package com.compare.au.runner;

import com.compare.au.common.ReportHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(strict = true, tags = {"@CarInsuranceCompare"},
        features = {"src/test/resources/features/"},
        glue = {"com.compare.au"},
        plugin = {"pretty", "html:target/cucumber-report/cucumber-html-reports",
                "json:target/cucumber-report/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
    @AfterSuite(alwaysRun=true)
    public void generateHTMLReports() {
        ReportHelper.generateCucumberReport();
    }
}