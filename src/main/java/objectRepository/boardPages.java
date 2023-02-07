package objectRepository;

import org.openqa.selenium.By;

public class boardPages {
    By menu_board = By.xpath("//android.view.View[@content-desc=\"Board\"]");
    By btn_addlist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By field_listname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By btn_submit_addlist = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    By daftar_list = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]");
    By second_list = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    By btn_addcard = By.xpath("(//android.widget.Button[@content-desc=\"Add new card\"])[1]");
    By field_namecard = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText");
    By btn_done = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View");
    By list_card = By.xpath("(//android.widget.Button[@content-desc=\"feature card\n" +
            "Show menu\"])[1]");
    By btn_switch_card = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch");
    By result_card = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View");

    By btn_edit_desc_card = By.xpath("//android.view.View[@content-desc=\"feature card\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]");
    By field_description = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_publish_desc = By.xpath("//android.widget.Button[@content-desc=\"Publish\"]");
    By result_desc = By.xpath("//android.view.View[@content-desc=\"show more note\"]");

    By btn_attachfile_card = By.xpath("//android.widget.Button[@content-desc=\"Attach file\"]");
    By allow_permission = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    By file = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout");
    By toast_uploadfiles = By.xpath("//android.view.View[@content-desc=\"Upload attachments is success\"]");
    By result_file = By.xpath("//android.view.View[@content-desc=\"n\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]");

    By btn_addcomment_card = By.xpath("//android.view.View[@content-desc=\"Add new comment...\"]");
    By field_comment_card = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    By btn_submit_comment = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    By result_comment = By.xpath("//android.view.View[@content-desc=\"a moment ago\n" +
            "Testing QA 11\n" +
            "feature chat\n" +
            "5:48 PM\"]");

    By btn_addlabel = By.xpath("//android.view.View[@content-desc=\"feature card\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]");
    By btn_createlabel = By.xpath("//android.widget.Button[@content-desc=\"Create new label\"]");
    By field_labelname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By btn_color = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[5]");
    By btn_submit_label = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    By btn_ceklis_keyboard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]");
    By toast_createlabel = By.xpath("//android.view.View[@content-desc=\"Creating label for this board is success\"]");

    public By getBtn_ceklis_keyboard() {
        return btn_ceklis_keyboard;
    }

    public By getSecond_list() {
        return second_list;
    }

    public By getResult_comment() {
        return result_comment;
    }

    public By getList_card() {
        return list_card;
    }

    public By getBtn_addlist() {
        return btn_addlist;
    }

    public By getMenu_board() {
        return menu_board;
    }

    public By getField_description() {
        return field_description;
    }

    public By getBtn_done() {
        return btn_done;
    }

    public By getBtn_addcard() {
        return btn_addcard;
    }

    public By getBtn_submit_addlist() {
        return btn_submit_addlist;
    }

    public By getField_listname() {
        return field_listname;
    }

    public By getBtn_switch_card() {
        return btn_switch_card;
    }

    public By getBtn_edit_desc_card() {
        return btn_edit_desc_card;
    }

    public By getBtn_publish_desc() {
        return btn_publish_desc;
    }

    public By getAllow_permission() {
        return allow_permission;
    }

    public By getDaftar_list() {
        return daftar_list;
    }

    public By getField_namecard() {
        return field_namecard;
    }

    public By getResult_card() {
        return result_card;
    }

    public By getResult_desc() {
        return result_desc;
    }

    public By getBtn_attachfile_card() {
        return btn_attachfile_card;
    }

    public By getBtn_addcomment_card() {
        return btn_addcomment_card;
    }

    public By getBtn_addlabel() {
        return btn_addlabel;
    }

    public By getBtn_submit_comment() {
        return btn_submit_comment;
    }

    public By getBtn_color() {
        return btn_color;
    }

    public By getBtn_createlabel() {
        return btn_createlabel;
    }

    public By getFile() {
        return file;
    }

    public By getResult_file() {
        return result_file;
    }

    public By getBtn_submit_label() {
        return btn_submit_label;
    }

    public By getField_comment_card() {
        return field_comment_card;
    }

    public By getField_labelname() {
        return field_labelname;
    }

    public By getToast_createlabel() {
        return toast_createlabel;
    }

    public By getToast_uploadfiles() {
        return toast_uploadfiles;
    }
}
