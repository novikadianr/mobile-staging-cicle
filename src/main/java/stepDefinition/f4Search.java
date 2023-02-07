package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.searchPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f4Search extends hooks{
    searchPages search = new searchPages();

    @When("user click tab search")
    public void user_click_tab_search() {
        MobileElement tab_search = (MobileElement) driver.findElement(search.getMenu_search());
        tab_search.click();
    }
    @And("user click team name")
    public void user_click_team_name() {
        MobileElement search_team = (MobileElement) driver.findElement(search.getSearch_team1());
        search_team.isDisplayed();
        search_team.click();
    }
    @Then("user verify search by team result")
    public void user_verify_search_by_team_result() {
        MobileElement result_search = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(search.getResulttab_team1()));
        result_search.isDisplayed();
    }

    //TC11
    @When("user input team name or menu")
    public void user_input_team_name_or_menu() {
        MobileElement field_search = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(search.getField_searching()));
        field_search.click();
        field_search.sendKeys("Blast");
    }
    @Then("user verify search result")
    public void user_verify_search_result() {
        MobileElement result_field_search = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(search.getResult_searching()));
        result_field_search.isDisplayed();
    }
}
