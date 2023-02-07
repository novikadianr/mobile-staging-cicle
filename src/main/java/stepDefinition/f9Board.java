package stepDefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.boardPages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class f9Board extends hooks{
    boardPages board = new boardPages();
    scroll srcollpages = new scroll();

    //TC25
    @When("user click menu board")
    public void user_click_menu_board() {
        driver.findElement(board.getMenu_board()).click();
    }
    @And("user click icon add list")
    public void user_click_icon_add_list() {
        driver.findElement(board.getBtn_addlist()).click();
    }
    @And("user input list name")
    public void user_input_list_name() {
        MobileElement field_name = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getField_listname()));
        field_name.isDisplayed();
        field_name.sendKeys("progress");
    }
    @And("user click submit button")
    public void user_click_submit_button() {
        driver.findElement(board.getBtn_submit_addlist()).click();
    }
    @Then("user verify addlist result")
    public void user_verify_addlist_result() {
        MobileElement result_addlist = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getDaftar_list()));
        result_addlist.isDisplayed();
    }

    //TC26
    @And("user already has list")
    public void user_already_has_list() {
        MobileElement list = (MobileElement) driver.findElement(board.getDaftar_list());
        list.isDisplayed();
    }
    @When("user click add new card button")
    public void user_click_add_new_card_button() {
        MobileElement btn_card = (MobileElement) driver.findElement(board.getBtn_addcard());
        btn_card.click();
    }
    @And("user input name card")
    public void user_input_name_card() {
        MobileElement field_namecard = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getField_namecard()));
        field_namecard.isDisplayed();
        field_namecard.sendKeys("feature card");
    }
    @And("user click ceklist button")
    public void user_click_ceklist_button() {
        MobileElement btn_done = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getBtn_done()));
        btn_done.isDisplayed();
        btn_done.click();
    }
    @Then("user verify addcard result")
    public void user_verify_addcard_result() {
        MobileElement list_card = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getResult_card()));
        list_card.isDisplayed();
    }

    //TC27
    @And("user already has card")
    public void user_already_has_card() {
        MobileElement list_card = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getResult_card()));
        list_card.isDisplayed();
    }
    @When("user click card")
    public void user_click_card() {
        driver.findElement(board.getList_card()).click();
    }
    @And("user click icon edit description")
    public void user_click_icon_edit_description() {
        MobileElement btn_editdesc = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getBtn_edit_desc_card()));
        btn_editdesc.click();
    }
    @And("user input description of card")
    public void user_input_description_of_card() {
        MobileElement field_desc_card = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getField_description()));
        field_desc_card.isDisplayed();
        field_desc_card.sendKeys("Progress Mobile testing");
    }
    @And("user click button publish")
    public void user_click_button_publish() {
        driver.findElement(board.getBtn_publish_desc()).click();
    }
    @Then("user verify edit card result")
    public void user_verify_edit_card_result() {
        driver.findElement(board.getResult_desc()).isDisplayed();
    }

    //TC28
    @And("user click add label")
    public void user_click_add_label() {
        driver.findElement(board.getBtn_addlabel()).click();
    }
    @And("user click create label button")
    public void user_click_create_label_button(){
        MobileElement btn_createlabel = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getBtn_createlabel()));
        btn_createlabel.click();
    }
    @And("user input label name")
    public void user_input_label_name() {
        MobileElement field_label = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getField_labelname()));
        field_label.click();
        field_label.sendKeys("progress");
    }
    @And("user choose color label")
    public void user_choose_color_label() {
        driver.findElement(board.getBtn_color()).click();
    }
    @And("user click submit")
    public void user_click_submit() {
        driver.findElement(board.getBtn_ceklis_keyboard()).click();
        driver.findElement(board.getBtn_submit_label()).click();
    }
    @Then("user verify add label result")
    public void user_verify_add_label_result() {
        MobileElement result = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(board.getToast_createlabel()));
        result.isDisplayed();
    }

    //TC29
    @And("user click attach file button")
    public void user_click_attach_file_button() {
        driver.findElement(board.getBtn_attachfile_card()).click();
    }
    @And("user click allow permision")
    public void user_click_allow_permision() {
        driver.findElement(board.getAllow_permission()).isDisplayed();
        driver.findElement(board.getAllow_permission()).click();
    }
    @And("user upload file")
    public void user_upload_file() {
        driver.findElement(board.getFile()).isDisplayed();
        driver.findElement(board.getFile()).click();
    }

    @Then("user verify attachfile result")
    public void user_verify_attachfile_result() {
        driver.findElement(board.getToast_uploadfiles()).isDisplayed();
    }

    //TC30
    @And("user input comment")
    public void user_input_comment() {
        MobileElement btn_comment = (MobileElement) driver.findElement(
                        board.getBtn_addcomment_card());
        btn_comment.click();
        MobileElement field_comment = (MobileElement) wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        board.getField_comment_card()));
        field_comment.sendKeys("feature chat");
    }
    @And("user click submit button comment")
    public void user_click_submit_button_comment(){
        driver.findElement(board.getBtn_submit_comment()).click();
    }
    @Then("user verify comment result")
    public void user_verify_comment_result() throws InterruptedException {
        srcollpages.swipeVertical(driver,0.507,0.434,0.507,0.020);
        MobileElement result_comment = (MobileElement) driver.findElement(board.getResult_comment());
        result_comment.isDisplayed();
    }

    //TC31
    @When("user moved card")
    public void user_moved_card() {
        AndroidElement source = (AndroidElement) driver.findElement(By.xpath("((//android.widget.Button[@content-desc=\"feature card\n" +
                "1\n" +
                "Show menu\"])[1]"));
        AndroidElement target = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
        new AndroidTouchAction(driver)
                .longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(ElementOption.element(target))
                .release()
                .perform();
    }
    @Then("user verify card result")
    public void user_verify_card_result() {
        driver.findElement(board.getSecond_list()).isDisplayed();
    }
}
