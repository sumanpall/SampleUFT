package defRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"defStep"},tags= {"@RegressionTest"},
plugin= {"json:target/cucumber.json"})
public class TestRunner {

}
