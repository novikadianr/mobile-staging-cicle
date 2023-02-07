package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f10-docnfile.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportDocfiles/HTML_report.html","json:target/report/reportDocfiles/JSON_report.json", "junit:target/report/reportDocfiles/XML_report.xml"}
)
public class runDocnfiles {
}
