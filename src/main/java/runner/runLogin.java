package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f1-login.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportLogin/HTML_report.html","json:target/report/reportLogin/JSON_report.json", "junit:target/report/reportLogin/XML_report.xml"}
)
public class runLogin {
}
