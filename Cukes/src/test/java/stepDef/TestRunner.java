package stepDef;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\newdemo.feature",glue= {"stepDef"},tags= {"@RegressionTest","@FunctionalTest"},
plugin= {"html:target/cucumber.html"})
public class TestRunner {
 
}

