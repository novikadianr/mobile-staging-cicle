package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.blastPages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f8Blast extends hooks{
    blastPages blast = new blastPages();
    scroll sc = new scroll();
    @When("user click menu blast")
    public void user_click_menu_blast() {
        driver.findElement(blast.getMenu_blast()).click();
    }
    @And("user click icon add blast")
    public void user_click_icon_add_blast() {
        MobileElement add_blast = (MobileElement) driver.findElement(blast.getBtn_createblast());
        add_blast.isDisplayed();
        add_blast.click();
    }
    @And("user input title blast")
    public void user_input_title_blast() {
        MobileElement title_blast = (MobileElement) driver.findElement(blast.getField_titleblast());
        title_blast.isDisplayed();
        title_blast.click();
        title_blast.sendKeys("blast 1");
    }
    @And("user input description")
    public void user_input_description() {
        MobileElement desc_blast = (MobileElement) driver.findElement(blast.getField_description());
        desc_blast.isDisplayed();
        desc_blast.click();
        desc_blast.sendKeys("blast 1 aktif");
    }
    @And("user click publish button")
    public void user_click_publish_button() throws InterruptedException {
        sc.swipeVertical(driver,0.507,0.434,0.507,0.020);
        sc.swipeVertical(driver,0.507,0.987,0.507,0.544);

        MobileElement btn_publ = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(blast.getBtn_publish()));
        btn_publ.isDisplayed();
        btn_publ.click();
    }
    @Then("user verify create blast result")
    public void user_verify_create_blast_result() {
        driver.findElement(blast.getToast_success()).isDisplayed();
        driver.findElement(blast.getList_blast()).isDisplayed();
    }
}
