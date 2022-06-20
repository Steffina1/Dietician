package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(


plugin = {"pretty", "html:target/junitreport.html"},
features = {"src/test/resources/feature"},
glue = "stepdefinition")
public class Junitrunner {
	

}
