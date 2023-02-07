package objectRepository;

import org.openqa.selenium.By;

public class loginPages {
    By btn_skip = By.xpath("//android.view.View[@content-desc=\"Skip\"]");
    By btn_yess = By.xpath("//android.widget.Button[@content-desc=\"Yes!\"]");

    By btn_gosignin = By.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");
    By btn_sigin_withgoogle = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Google Account\"]");
    By list_email = By.id("com.google.android.gms:id/account_display_name");

    By cinfirm_notification = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout");
    By confirm_allow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    By confirm_dontallow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");

    By result_login = By.xpath("//android.widget.ImageView[@content-desc=\"logo\"]");

    public By getBtn_yess() {
        return btn_yess;
    }

    public By getBtn_skip() {
        return btn_skip;
    }

    public By getList_email() {
        return list_email;
    }

    public By getBtn_gosignin() {
        return btn_gosignin;
    }

    public By getResult_login() {
        return result_login;
    }

    public By getBtn_sigin_withgoogle() {
        return btn_sigin_withgoogle;
    }

    public By getCinfirm_notification() {
        return cinfirm_notification;
    }

    public By getConfirm_allow() {
        return confirm_allow;
    }

    public By getConfirm_dontallow() {
        return confirm_dontallow;
    }
}
