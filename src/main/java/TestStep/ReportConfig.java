package TestStep;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;


public class ReportConfig {

    public static void generateCucumberReport() {
        File reportOutputDirectory = new File("target");
        ArrayList<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("target/cucumber.json");

        String projectName = "Tanihub Automation Desktop Web";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.addClassifications("Desktop", "WEB");


        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}