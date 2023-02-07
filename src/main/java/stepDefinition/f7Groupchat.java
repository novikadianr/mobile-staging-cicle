package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.groupchatPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f7Groupchat extends hooks{
    groupchatPages chat = new groupchatPages();
    @When("user click menu group chat")
    public void user_click_menu_group_chat() {
        MobileElement menu_group = (MobileElement) driver.findElement(chat.getMenu_groupchat());
        menu_group.click();
    }
    @And("user input message")
    public void user_input_message() {
        MobileElement message = (MobileElement) driver.findElement(chat.getField_message());
        message.click();
        message.sendKeys("Hallo");
    }
    @And("user click icon send message button")
    public void user_click_icon_send_message_button() {
        MobileElement btn_send_message = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(chat.getBtn_sendMessage()));
        btn_send_message.isDisplayed();
        btn_send_message.click();
    }
    @Then("user verify message result")
    public void user_verify_message_result() {
        driver.findElement(chat.getList_message()).isDisplayed();
    }
    @And("user click icon attachfile")
    public void user_click_icon_attachfile() {
        driver.findElement(chat.getBtn_attachfile()).click();
    }
    @And("user menu image from camera")
    public void user_menu_image_from_camera() {
        MobileElement image_camera = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(chat.getBtn_imagefromcamera()));
        image_camera.isDisplayed();
        image_camera.click();
    }
    @And("user click icon camera")
    public void user_click_icon_camera() {
        driver.findElement(chat.getBtn_shutter()).click();
    }
    @And("user click icon ceklist")
    public void user_click_icon_ceklist() {
        MobileElement icon_done = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(chat.getBtn_done()));
        icon_done.isDisplayed();
        icon_done.click();
    }
    @Then("user verify image message result")
    public void user_verify_image_message_result() {
        driver.findElement(chat.getResult_addimage()).isDisplayed();
    }
    @And("user click icon retake")
    public void user_click_icon_retake() {
        MobileElement icon_retake = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(chat.getBtn_retake()));
        icon_retake.isDisplayed();
        icon_retake.click();
    }
    @Then("user verify retake image result")
    public void user_verify_retake_image_result() {
        MobileElement result_retake = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(chat.getBtn_shutter()));
        result_retake.isDisplayed();
    }
    @And("user click icon cancel")
    public void user_click_icon_cancel() {
        MobileElement icon_cancel = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(chat.getBtn_cancel()));
        icon_cancel.isDisplayed();
        icon_cancel.click();
    }
    @Then("user verify result")
    public void user_verify_result() {
        MobileElement result_cancel = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(chat.getBtn_imagefromcamera()));
        result_cancel.isDisplayed();
    }
}
