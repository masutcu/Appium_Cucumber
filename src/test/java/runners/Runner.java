package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/default-cucumber-report"},
        features = "src/test/resources/features",
        glue = {"stepDef","hooks"},
        tags = "@scroll",
        dryRun =false
)
public class Runner {
}

