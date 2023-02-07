package objectRepository;

import org.openqa.selenium.By;

public class tabmenuPages {
    By tab_menu = By.xpath("//android.view.View[@content-desc=\"Menu\n" +
            "Tab 4 of 4\"]");

    By profile_company = By.xpath("//android.widget.ImageView[@content-desc=\"Staging Cicle Mobile\"]");
    By btn_edit_profile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");

    By field_comp_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View/android.widget.EditText[1]");
    By field_comp_title = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View/android.widget.EditText[2]");
    By field_aboutme = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]");
    By edit_poto_profile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]");
    By list_images = By.id("com.google.android.documentsui:id/icon_thumb");
    By toast_success = By.xpath("//android.view.View[@content-desc=\"Successfully changing avatar\"]");
    By btn_icon_save = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
    By result_edit_nameprofile = By.xpath("//android.view.View[@content-desc=\"Staging Cicle Mobile\"]");
    By result_edit_titleprofile = By.xpath("//android.view.View[@content-desc=\"Testing Staging Cicle Mobile\"]");
    By result_edit_aboutme = By.xpath("//android.view.View[@content-desc=\"Dasar Testing Staging Cicle Mobile\n" +
            "\"]");

    By btn_logout = By.xpath("//android.view.View[@content-desc=\"Logout\n" +
            "v2.0.32+2052\"]");
    By confirm_logout = By.xpath("//android.view.View[@content-desc=\"Are you sure to logout ?\"]");
    By btn_confirm_ok = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");
    By btn_confirm_cancel = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");
    By result_logout = By.xpath("//android.view.View[@content-desc=\"Sick of miscoordination?\"]/android.widget.ImageView[3]");

    public By getToast_success() {
        return toast_success;
    }

    public By getBtn_logout() {
        return btn_logout;
    }

    public By getTab_menu() {
        return tab_menu;
    }

    public By getBtn_confirm_cancel() {
        return btn_confirm_cancel;
    }

    public By getBtn_confirm_ok() {
        return btn_confirm_ok;
    }

    public By getBtn_edit_profile() {
        return btn_edit_profile;
    }

    public By getBtn_icon_save() {
        return btn_icon_save;
    }

    public By getConfirm_logout() {
        return confirm_logout;
    }

    public By getEdit_poto_profile() {
        return edit_poto_profile;
    }

    public By getField_aboutme() {
        return field_aboutme;
    }

    public By getField_comp_name() {
        return field_comp_name;
    }

    public By getField_comp_title() {
        return field_comp_title;
    }

    public By getList_images() {
        return list_images;
    }

    public By getProfile_company() {
        return profile_company;
    }

    public By getResult_edit_aboutme() {
        return result_edit_aboutme;
    }

    public By getResult_edit_nameprofile() {
        return result_edit_nameprofile;
    }

    public By getResult_edit_titleprofile() {
        return result_edit_titleprofile;
    }

    public By getResult_logout() {
        return result_logout;
    }
}
