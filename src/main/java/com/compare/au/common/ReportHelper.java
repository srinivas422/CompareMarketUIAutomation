package com.compare.au.common;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportHelper {

    public static void generateCucumberReport() {
        File reportOutputDirectory = new File("target/cucumber-report");
        ArrayList<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("target/cucumber-report/cucumber.json");

        String projectName = "Api.TestAutomation";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.addClassifications("FormulaOne", "SeasonNumber");
        List<String> classificationFiles = new ArrayList<String>();
        configuration.addClassificationFiles(classificationFiles);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }

}
