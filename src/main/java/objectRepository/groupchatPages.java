package objectRepository;

import org.openqa.selenium.By;

public class groupchatPages {
    By menu_groupchat = By.xpath("//android.view.View[@content-desc=\"Group Chat\"]");
    By field_message = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_sendMessage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By list_message = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ScrollView");

    By btn_attachfile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");

    By btn_docnvideo = By.xpath("//android.view.View[@content-desc=\"Document & Video\"]");
    By file_doc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
    By result_senddoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ScrollView/android.view.View[4]");

    By btn_imagefromcamera = By.xpath("//android.view.View[@content-desc=\"Image from Camera\"]");
    By btn_shutter = By.id("com.android.camera2:id/shutter_button");
    By btn_done = By.id("com.android.camera2:id/done_button");
    By btn_retake = By.id("com.android.camera2:id/retake_button");
    By btn_cancel = By.id("com.android.camera2:id/cancel_button");
    By result_addimage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ScrollView/android.widget.ImageView");

    By btn_imagefromgalerry = By.xpath("//android.view.View[@content-desc=\"Image from Gallery\"]");
    By file_image = By.id("com.google.android.documentsui:id/icon_thumb");
    By result_uploadimage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]");

    By btn_messagemenu = By.xpath("//android.widget.ImageView[@content-desc=\"04:33 PM\"]/android.view.View");
    By btn_delete = By.xpath("//android.view.View[@content-desc=\"Delete\"]");
    By confirmation = By.xpath("//android.view.View[@content-desc=\"are you sure you want to delete message ?\"]");
    By btnconfirm_ok = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");
    By btnconfirm_cancel = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");
    By toast_success = By.xpath("//android.view.View[@content-desc=\"Delete group chat attachment success\"]");
    By result_delete = By.xpath("//android.view.View[@content-desc=\"This message was deleted\n" +
            "04:33 PM\"]");

    public By getBtn_done() {
        return btn_done;
    }

    public By getBtn_shutter() {
        return btn_shutter;
    }

    public By getBtn_retake() {
        return btn_retake;
    }

    public By getBtn_cancel() {
        return btn_cancel;
    }

    public By getToast_success() {
        return toast_success;
    }

    public By getBtn_sendMessage() {
        return btn_sendMessage;
    }

    public By getBtn_attachfile() {
        return btn_attachfile;
    }

    public By getField_message() {
        return field_message;
    }

    public By getBtn_docnvideo() {
        return btn_docnvideo;
    }

    public By getBtn_delete() {
        return btn_delete;
    }

    public By getBtn_imagefromcamera() {
        return btn_imagefromcamera;
    }

    public By getMenu_groupchat() {
        return menu_groupchat;
    }

    public By getBtn_imagefromgalerry() {
        return btn_imagefromgalerry;
    }

    public By getBtn_messagemenu() {
        return btn_messagemenu;
    }

    public By getBtnconfirm_cancel() {
        return btnconfirm_cancel;
    }

    public By getBtnconfirm_ok() {
        return btnconfirm_ok;
    }

    public By getConfirmation() {
        return confirmation;
    }

    public By getFile_doc() {
        return file_doc;
    }

    public By getFile_image() {
        return file_image;
    }

    public By getList_message() {
        return list_message;
    }

    public By getResult_addimage() {
        return result_addimage;
    }

    public By getResult_delete() {
        return result_delete;
    }

    public By getResult_senddoc() {
        return result_senddoc;
    }

    public By getResult_uploadimage() {
        return result_uploadimage;
    }
}
