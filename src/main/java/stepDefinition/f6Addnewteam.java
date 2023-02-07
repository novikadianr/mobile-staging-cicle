package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.teamPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f6Addnewteam extends hooks{
    teamPages team = new teamPages();

    @When("user click iconplus")
    public void user_click_iconplus() {
        teamPages team = new teamPages();
        MobileElement icon_addteam = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(team.getBtn_addteam()));
        icon_addteam.click();
    }
    @And("user click add new team")
    public void user_click_add_new_team() {
        MobileElement menu_addteam = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(team.getBtn_menuaddteam()));
        menu_addteam.isDisplayed();
        menu_addteam.click();
    }
    @And("user input name team")
    public void user_input_name_team() {
        MobileElement team_name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(team.getField_nameteam()));
        team_name.isDisplayed();
        team_name.click();
        team_name.sendKeys("Team A");
    }
    @And("user input description team")
    public void user_input_description_team() {
        MobileElement desc_name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(team.getField_descteam()));
        desc_name.click();
        desc_name.sendKeys("Team A Mobile");
    }
    @And("user click create team button")
    public void user_click_create_team_button() {
        MobileElement btn_create = (MobileElement) driver.findElement(team.getBtn_create_team());
        btn_create.click();
    }
    @Then("user verify new team result")
    public void user_verify_new_team_result() {
        driver.findElement(team.getResult_addteam()).isDisplayed();
    }
    @Then("user verify null name result")
    public void user_verify_null_name_result() {
        driver.findElement(team.getToast_error_message()).isDisplayed();
    }
    @Then("user verify null description result")
    public void user_verify_null_description_result() {
        driver.findElement(team.getToast_error_message()).isDisplayed();
    }
}
