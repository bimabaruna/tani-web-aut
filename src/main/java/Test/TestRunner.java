package Test;

import TestStep.ReportConfig;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@CucumberOptions(

        glue = "TestStep",
        features = "src/test/java/",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
        },
        tags = {"@LoginE2E"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

    public String reportDirectory = "reports";
    public String reportFormat = "xml";

    public static WebDriver driver = null ;
    DesiredCapabilities dc = new DesiredCapabilities();
    public static String baseEnv;
    public static String sprint;
    protected static WebDriverWait wt;

    public void setUp() throws IOException, InterruptedException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Meister-\\IntelliJIDEAProjects\\AutomationTest\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://tanihub.com/");


    }

    @Before
    public void asd(Scenario scenario){
        String scenarioName = scenario.getName();
        String[] arrayScenarioName = scenarioName.split("--");
        String scenarioName1 = arrayScenarioName[0];
        String scenarioName2 = arrayScenarioName[1];
        System.out.println("Scenario Name 1 for this test is -> " + scenarioName1);
        System.out.println("Scenario Name 2 for this test is -> " + scenarioName2);
    }

    @AfterSuite(alwaysRun = true)
    public void quit() throws IOException, InterruptedException {
        ReportConfig.generateCucumberReport();
        driver.quit();
    }

    @BeforeSuite
    public void setUpp() throws Exception {
        setUp();
    }


}
