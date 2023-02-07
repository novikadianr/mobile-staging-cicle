package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f8-blast.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportBlast/HTML_report.html","json:target/report/reportBlast/JSON_report.json", "junit:target/report/reportBlast/XML_report.xml"}
)
public class runBlast {
}
