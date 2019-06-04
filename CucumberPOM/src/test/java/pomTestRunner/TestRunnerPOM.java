package pomTestRunner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Pomfeature",glue= {"pomStepsdef"},
plugin= {"json:target/cucumber.json"})
public class TestRunnerPOM {

	
}
