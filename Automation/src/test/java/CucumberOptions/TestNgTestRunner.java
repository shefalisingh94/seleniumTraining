package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/GreenKart.feature", glue = "stepDefinations")
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
