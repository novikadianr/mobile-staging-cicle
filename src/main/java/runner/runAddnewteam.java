package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f6-addnewteam.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportAddnewteam/HTML_report.html","json:target/report/reportAddnewteam/JSON_report.json", "junit:target/report/reportAddnewteam/XML_report.xml"}
)
public class runAddnewteam {
}
