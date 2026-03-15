package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/Account.feature",glue="SalesforceSteps")
public class Salesforcerun extends AbstractTestNGCucumberTests {

}
