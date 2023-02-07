package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f9-board.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportBoard/HTML_report.html","json:target/report/reportBoard/JSON_report.json", "junit:target/report/reportBoard/XML_report.xml"}
)
public class runBoard {

}
