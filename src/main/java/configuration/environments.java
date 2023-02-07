package configuration;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class environments {
    public static AppiumDriver driver;
    public static DesiredCapabilities capabilities;
    public static int duration = 3;
    public static WebDriverWait wait;
}
