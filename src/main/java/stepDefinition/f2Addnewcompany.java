package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.companyPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f2Addnewcompany extends hooks {
    companyPages company = new companyPages();
    @When("user click create new company button")
    public void user_click_create_new_company_button() {
        MobileElement btn_createcomp = (MobileElement) driver.findElement(company.getBtn_create_company());
        btn_createcomp.click();
    }
    @And("user input company name")
    public void user_input_company_name() {
        MobileElement field_name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(company.getField_companyname()));
        field_name.click();
        field_name.sendKeys("Testing Mobile");
    }
    @And("user input company description")
    public void user_input_company_description() {
        MobileElement field_desc = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(company.getField_companydesc()));
        field_desc.click();
        field_desc.sendKeys("Mobile Staging");
    }
    @And("user click create button")
    public void user_click_create_button() {
        MobileElement btn_create = (MobileElement) driver.findElement(company.getBtn_create());
        btn_create.click();
    }
    @Then("user verify add company result")
    public void user_verify_add_company_result() {
        MobileElement success_create = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(company.getToast_success_create()));
        success_create.isDisplayed();
    }
    @Then("user see error message")
    public void user_see_error_message() {
        MobileElement error_create = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(company.getToast_error_create()));
        error_create.isDisplayed();
    }
}
