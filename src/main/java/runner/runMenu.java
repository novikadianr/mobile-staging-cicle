package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f5-menu.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportMenu/HTML_report.html","json:target/report/reportMenu/JSON_report.json", "junit:target/report/reportMenu/XML_report.xml"}
)
public class runMenu {
}
