package stepDefinition;

import configuration.environments;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hooks extends environments {
    @Before
    public void before() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 3a XL API 33");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("app", "/Users/novikadianrenanda/Downloads/apk-staging-for-iqbal.apk");
//        capabilities.setCapability("appPackage", "com.wdiodemoapp");
//        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);

    }
    @After
    public void after(){
        driver.quit();
    }
}
