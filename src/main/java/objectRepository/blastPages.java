package objectRepository;

import org.openqa.selenium.By;

public class blastPages {
    By menu_blast = By.xpath("//android.view.View[@content-desc=\"Blast\"]");
    By btn_createblast = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By field_titleblast = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
    By field_description = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_addmember = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[6]");
    By btn_switch = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
    By btn_publish = By.xpath("//android.widget.Button[@content-desc=\"Publish\"]");
    By list_blast = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View");
    By toast_success = By.xpath("//android.view.View[@content-desc=\"Create post successful\"]");
    By toast_error_title = By.xpath("//android.view.View[@content-desc=\"Title must be filled\"]");
    By toast_error_desc = By.xpath("//android.view.View[@content-desc=\"Description must be filled\"]");

    public By getBtn_addmember() {
        return btn_addmember;
    }

    public By getBtn_switch() {
        return btn_switch;
    }

    public By getList_blast() {
        return list_blast;
    }

    public By getBtn_publish() {
        return btn_publish;
    }

    public By getMenu_blast() {
        return menu_blast;
    }

    public By getBtn_createblast() {
        return btn_createblast;
    }

    public By getField_description() {
        return field_description;
    }

    public By getField_titleblast() {
        return field_titleblast;
    }

    public By getToast_error_desc() {
        return toast_error_desc;
    }

    public By getToast_error_title() {
        return toast_error_title;
    }

    public By getToast_success() {
        return toast_success;
    }
}
