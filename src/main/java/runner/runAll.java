package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportAll/HTML_report.html","json:target/report/reportAll/JSON_report.json", "junit:target/report/reportAll/XML_report.xml"}
)
public class runAll {
}
