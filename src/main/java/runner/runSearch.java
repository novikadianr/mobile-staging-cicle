package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f4-search.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportSearch/HTML_report.html","json:target/report/reportSearch/JSON_report.json", "junit:target/report/reportSearch/XML_report.xml"}
)
public class runSearch {
}
