package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.notificationPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f3Notification extends hooks {
    notificationPages notif = new notificationPages();

    @When("user click menu notification")
    public void user_click_menu_notification() {
        notificationPages notif = new notificationPages();
        MobileElement menu_notif = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(notif.getMenu_notification()));
        menu_notif.isDisplayed();
        menu_notif.click();
    }
    @And("user click All button")
    public void user_click_all_button() {
        driver.findElement(notif.getMenu_allnotif()).click();
    }
    @Then("user verify notification result")
    public void user_verify_notification_result() {
        driver.findElement(notif.getList_notif()).isDisplayed();
    }
    @And("user click All unread")
    public void user_click_all_unread() {
        driver.findElement(notif.getMenu_allunread()).click();
    }
    @Then("user verify unread result")
    public void user_verify_unread_result() {
        driver.findElement(notif.getList_notif_unread()).isDisplayed();
    }
    @And("user click icon filter")
    public void user_click_icon_filter() {
        driver.findElement(notif.getBtn_filter()).click();
    }
    @And("user input team name")
    public void user_input_team_name() {
        driver.findElement(notif.getField_search()).click();
        driver.findElement(notif.getField_search()).sendKeys("Team A");
    }
    @Then("user verify filter notif result")
    public void user_verify_filter_notif_result() {
        driver.findElement(notif.getResult_filter()).isDisplayed();
    }
}
