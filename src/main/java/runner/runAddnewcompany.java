package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f2-addnewcompany.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportAddcomp/HTML_report.html","json:target/report/reportAddcomp/JSON_report.json", "junit:target/report/reportAddcomp/XML_report.xml"}
)
public class runAddnewcompany {

}
