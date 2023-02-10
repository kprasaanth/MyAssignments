package week6_day2_Assignment_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import week6_day2_Assignment_StepDefinition.Hooks_BaseClass;

@CucumberOptions(features="src/test/java/week6_Day2_Assignment",
				 glue="week6_day2_Assignment_StepDefinition",
				 monochrome=true,
				 publish = true,
				 tags="@smoke or @sanity")
public class Runner extends Hooks_BaseClass{

}
