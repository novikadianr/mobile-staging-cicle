package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.loginPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f1Login extends hooks {
    loginPages login = new loginPages();
    @And("user click skip button")
    public void user_click_skip_button() {
        MobileElement btn_skip = (MobileElement) driver.findElement(login.getBtn_skip());
        btn_skip.click();
    }
    @When("user click go to sign in button")
    public void user_click_go_to_sign_in_button() {
        MobileElement btn_gotosignin = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(login.getBtn_gosignin()));
        btn_gotosignin.isDisplayed();
        btn_gotosignin.click();
    }
    @And("user click Sign in with Google Account button")
    public void user_click_sign_in_with_google_account_button() {
        MobileElement btn_signin_google = (MobileElement) driver.findElement(login.getBtn_sigin_withgoogle());
        btn_signin_google.click();
    }
    @And("user click email")
    public void user_click_email() {
        MobileElement list_email = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(login.getList_email()));
        list_email.isDisplayed();
        list_email.click();
    }
    @Then("user verify login result")
    public void user_verify_login_result() {
        MobileElement confirmation  = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(login.getCinfirm_notification()));
        confirmation.isDisplayed();
        MobileElement confirm_allow = (MobileElement) driver.findElement(login.getConfirm_allow());
        confirm_allow.click();
        MobileElement result_login = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(login.getResult_login()));
        result_login.isDisplayed();
    }
    @And("user click yess button")
    public void user_click_yess_button() {
        MobileElement btn_yess = (MobileElement) driver.findElement(login.getBtn_yess());
        btn_yess.click();
    }
}
