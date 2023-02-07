package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/f3-notification.feature",
        glue = "stepDefiniton",
        plugin = {"html:target/report/reportNotif/HTML_report.html","json:target/report/reportNotif/JSON_report.json", "junit:target/report/reportNotif/XML_report.xml"}
)
public class runNotification {
}
