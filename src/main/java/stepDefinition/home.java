package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objectRepository.companyPages;
import objectRepository.groupchatPages;
import objectRepository.loginPages;
import objectRepository.teamPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class home extends hooks{
    @Given("user is on app")
    public void user_is_on_app() throws MalformedURLException {
        before();
    }
    @Given("user is on homepages")
    public void user_is_on_homepages() throws MalformedURLException {
        before();
        loginPages login = new loginPages();

        driver.findElement(login.getBtn_skip()).click();
        driver.findElement(login.getBtn_gosignin()).click();
        driver.findElement(login.getBtn_sigin_withgoogle()).click();
        driver.findElement(login.getList_email()).click();
        driver.findElement(login.getCinfirm_notification()).isDisplayed();
        driver.findElement(login.getConfirm_allow()).click();
    }
    @And("user has company")
    public void user_has_company() {
        companyPages company = new companyPages();
        MobileElement list_comp = (MobileElement) driver.findElement(company.getList_company());
        list_comp.isDisplayed();
        list_comp.click();
    }
    @Given("user already has team")
    public void user_already_has_team() {
        teamPages team = new teamPages();
        MobileElement list_team = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(team.getList_team()));
        list_team.isDisplayed();
        list_team.click();
    }


}
