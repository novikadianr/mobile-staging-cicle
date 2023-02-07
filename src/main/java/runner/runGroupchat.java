package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f7-groupchat.feature",
        glue = "stepDefinition",
        plugin = {"html:target/report/reportGroupchat/HTML_report.html","json:target/report/reportGroupchat/JSON_report.json", "junit:target/report/reportGroupchat/XML_report.xml"}
)
public class runGroupchat {
}
