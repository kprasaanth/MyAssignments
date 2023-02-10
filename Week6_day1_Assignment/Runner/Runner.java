package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature_week6_day1_Assignemnt", glue="week6_day1_Assignment",
monochrome=true, publish=true)

public class Runner extends AbstractTestNGCucumberTests{

	
}
