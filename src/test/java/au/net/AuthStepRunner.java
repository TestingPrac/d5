package au.net;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources"},
        glue = {"net.stepdefinition"},
        monochrome = true,
        plugin = {"pretty", "json:src\\test\\resources\\report\\pega.json"}
)
class AuthStepRunner {
    public AuthStepRunner() {
    }


}
