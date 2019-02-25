package stepDef;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\newdemo.feature",glue= {"stepDef"},tags= {"@RegressionTest"},
plugin= {"json:target/cucumber.json"})
public class TestRunner {
 
}

