package stepDefinition;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.docnfilesPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class f10Docnfiles extends hooks{
    docnfilesPages doc = new docnfilesPages();
    scroll scr = new scroll();

    //TC32
    @When("user click docnfiles button")
    public void user_click_docnfiles_button() throws InterruptedException {
        scr.swipeVertical(driver,0.504,0.1734,0.521,0.1170);
        MobileElement btn_docnfiles = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getMenu_docnfiles()));
        btn_docnfiles.click();
    }
    @And("user click icon add")
    public void user_click_icon_add() {
        MobileElement btn_add = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getBtn_add()));
        btn_add.click();
    }
    @And("user click add new doc button")
    public void user_click_add_new_doc_button() {
        driver.findElement(doc.getBtn_addnnewdoc()).isDisplayed();
        driver.findElement(doc.getBtn_addnnewdoc()).click();
    }
    @And("user input title")
    public void user_input_title() {
        MobileElement field_title = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getField_titledoc()));
        field_title.click();
        field_title.sendKeys("document meeting");
    }
    @And("user input desc document")
    public void user_input_desc_document() {
        MobileElement field_title = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getField_desc()));
        field_title.click();
        field_title.sendKeys("document meeting");
    }
    @And("user click button publis")
    public void user_click_button_publis() throws InterruptedException {
        scr.swipeVertical(driver,0.504,0.431,0.533,0.014);
        scr.swipeVertical(driver,0.504,0.1265,0.472,0.912);
        MobileElement btn_pub = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getBtn_publish_newdoc()));
        btn_pub.click();
    }
    @Then("user verify new doc result")
    public void user_verify_new_doc_result() {
        MobileElement toast_newdoc = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getToast_success_adddoc()));
        toast_newdoc.isDisplayed();

        MobileElement result_addnewdoc = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getResult_addnewdoc()));
        result_addnewdoc.isDisplayed();
    }

    //TC33
    @And("user click create new folder button")
    public void user_click_create_new_folder_button() {
        MobileElement btn_newfolder = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getBtn_createnewfolder()));
        btn_newfolder.isDisplayed();
        btn_newfolder.click();
    }
    @And("user input name folder")
    public void user_input_name_folder() {
        MobileElement field_namefol = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getField_foldername()));
        field_namefol.click();
        field_namefol.sendKeys("zoom");
    }
    @And("user click create folder button")
    public void user_click_create_folder_button() {
        MobileElement btn_create = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getBtn_create_folder()));
        btn_create.isDisplayed();
        btn_create.click();
    }
    @Then("user verify new folder result")
    public void user_verify_new_folder_result() {
        MobileElement verify_newfolder = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getResult_addfolder()));
        verify_newfolder.isDisplayed();
    }

    //TC34
    @And("user click upload file button")
    public void user_click_upload_file_button() {
        MobileElement menu_uploadfile = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getBtn_uploadfile()));
        menu_uploadfile.isDisplayed();
        menu_uploadfile.click();
    }
    @And("user upload file doc")
    public void user_upload_file_doc() {
        MobileElement confirm_permisson = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getPermission_allow()));
        confirm_permisson.isDisplayed();
        confirm_permisson.click();

        MobileElement choose_file = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getFile_upload()));
        choose_file.isDisplayed();
        choose_file.click();
    }
    @Then("user verify file result")
    public void user_verify_file_result() {
        MobileElement result_file = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(doc.getResult_uploadfile()));
        result_file.isDisplayed();

    }
}
