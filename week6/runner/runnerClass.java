package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/login.feature",glue="stepDefinition")
public class runnerClass extends AbstractTestNGCucumberTests{
	
	

}
