package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.tabmenuPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f5Menu extends hooks{
    tabmenuPages menu = new tabmenuPages();
    @When("user click tab menu")
    public void user_click_tab_menu() {
        MobileElement tab_menu = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getTab_menu()));
        tab_menu.click();
    }
    @And("user click company name")
    public void user_click_company_name() {
        MobileElement profile_comp = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getProfile_company()));
        profile_comp.isDisplayed();
        profile_comp.click();
    }
    @And("user click icon edit")
    public void user_click_icon_edit() {
        MobileElement btn_editprofile = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getBtn_edit_profile()));
        btn_editprofile.click();
    }
    @And("user edit name company")
    public void user_edit_name_company() {
        MobileElement edit_name = (MobileElement) driver.findElement(menu.getField_comp_name());
        edit_name.isDisplayed();
        edit_name.click();
        edit_name.sendKeys("Staging Cicle Mobile");
    }
    @And("user click icon save")
    public void user_click_icon_save() {
        MobileElement btn_save = (MobileElement) driver.findElement(menu.getBtn_icon_save());
        btn_save.click();
    }
    @Then("user verify update name result")
    public void user_verify_update_name_result() {
        MobileElement result_update = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getResult_edit_nameprofile()));
        result_update.isDisplayed();
    }
    @And("user edit title company")
    public void user_edit_title_company() {
        MobileElement edit_title = (MobileElement) driver.findElement(menu.getField_comp_title());
        edit_title.click();
        edit_title.sendKeys("Testing Staging Cicle Mobile");
    }

    @Then("user verify update title result")
    public void user_verify_update_title_result() {
        MobileElement update_title = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getResult_edit_titleprofile()));
        update_title.isDisplayed();
    }
    @And("user edit bio company")
    public void user_edit_bio_company() {
        MobileElement edit_aboume = (MobileElement) driver.findElement(menu.getField_aboutme());
        edit_aboume.click();
        edit_aboume.sendKeys("Dasar Testing Staging Cicle Mobile");
    }

    @Then("user verify update bio result")
    public void user_verify_update_bio_result() {
        MobileElement update_aboutme = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getResult_edit_aboutme()));
        update_aboutme.isDisplayed();
    }
    @And("user profile picture")
    public void user_profile_picture() {
        driver.findElement(menu.getEdit_poto_profile()).click();
    }

    @And("user choose picture")
    public void user_choose_picture() {
        MobileElement edit_poto = (MobileElement) driver.findElement(menu.getList_images());
        edit_poto.isDisplayed();
        edit_poto.click();
    }

    @Then("user verify update profile picture result")
    public void user_verify_update_profile_picture_result() {
        MobileElement result_poto = (MobileElement) driver.findElement(menu.getToast_success());
        result_poto.isDisplayed();
    }

    @And("user click logout menu")
    public void user_click_logout_menu() {
        MobileElement btn_logout = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getBtn_logout()));
        btn_logout.click();
    }
    @And("see confirmation")
    public void see_confirmation() {
        MobileElement confirm_logout = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getConfirm_logout()));
        confirm_logout.isDisplayed();
    }
    @And("click confirmation ok")
    public void click_confirmation_ok() {
        MobileElement confirm_ok = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getBtn_confirm_ok()));
        confirm_ok.click();
    }
    @Then("user verify logout result")
    public void user_verify_logout_result() {
        MobileElement result_logout = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(menu.getResult_logout()));
        result_logout.isDisplayed();
    }
}
