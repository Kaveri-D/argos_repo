package uk.co.ecom.argos.automation.test.framework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:featurefiles",
        glue = "classpath:",
        tags ={"@Automated"},
        dryRun = false,
        strict = true)
public class CucumberRunnerClass {
}
