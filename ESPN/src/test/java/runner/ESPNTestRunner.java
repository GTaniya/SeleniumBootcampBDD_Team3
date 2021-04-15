package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // For single feature file
        // features = {"src/test/java/features/HomePage.feature"}
        features = {"src/test/java/features"},
        // the path of the step definition files
        //  glue = "src/test/java/stepDefinitions",
        glue = "stepDefinitions",
        /// to generate different type of reporting
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/index.html",
        "pretty:target/cucumber-reports/cucumber-pretty.txt","usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-results.xml"
        },
        // it will check if any step is not defined in step definition file
        strict = true,
        // display the console output in a proper readable format
        monochrome = true,
        // to check the mapping is proper between feature file and step definition file
        dryRun = false,
        publish = true,
        tags = "(@somkeTest) and (not @pending)"
//         tags = "(@smokeTest or @RegressionTest or @IntegrationTest ) and (not @pending)"



)


public class ESPNTestRunner {


}
