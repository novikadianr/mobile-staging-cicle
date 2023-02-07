package objectRepository;

import org.openqa.selenium.By;

public class docnfilesPages {
    By menu_docnfiles = By.xpath("//android.view.View[@content-desc=\"Docs & Files\"]");
    By btn_add = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");

    By btn_uploadfile = By.xpath("//android.view.View[@content-desc=\"Upload File\"]");
    By file_upload = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout");
    By toast_successupload = By.xpath("//android.view.View[@content-desc=\"Create files successful\"]");
    By result_uploadfile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View");

    By btn_createnewfolder = By.xpath("//android.view.View[@content-desc=\"Create a new folder\"]");
    By field_foldername = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By btn_create_folder = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By toast_success_createfolder = By.xpath("//android.view.View[@content-desc=\"Create bucket successful\"]");
    By getToast_error_createfolder = By.xpath("//android.view.View[@content-desc=\"Folder name must be filled\"]");
    By result_addfolder = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View");

    By btn_addnnewdoc = By.xpath("//android.view.View[@content-desc=\"Add a new doc\"]");
    By field_titledoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    By field_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText");
    By btn_publish_newdoc = By.xpath("//android.widget.Button[@content-desc=\"Publish\"]");
    By toast_success_adddoc = By.xpath("//android.view.View[@content-desc=\"Create doc successful\"]");
    By toast_error_adddoc = By.xpath("//android.view.View[@content-desc=\"Description must be filled\"]");
    By result_addnewdoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View");

    By permission_allow = By.id("com.android.permissioncontroller:id/permission_allow_button");

    public By getField_desc() {
        return field_desc;
    }

    public By getPermission_allow() {
        return permission_allow;
    }

    public By getBtn_add() {
        return btn_add;
    }

    public By getMenu_docnfiles() {
        return menu_docnfiles;
    }

    public By getBtn_addnnewdoc() {
        return btn_addnnewdoc;
    }

    public By getBtn_create_folder() {
        return btn_create_folder;
    }

    public By getBtn_createnewfolder() {
        return btn_createnewfolder;
    }

    public By getBtn_uploadfile() {
        return btn_uploadfile;
    }

    public By getField_foldername() {
        return field_foldername;
    }

    public By getBtn_publish_newdoc() {
        return btn_publish_newdoc;
    }

    public By getFile_upload() {
        return file_upload;
    }

    public By getField_titledoc() {
        return field_titledoc;
    }

    public By getGetToast_error_createfolder() {
        return getToast_error_createfolder;
    }

    public By getResult_uploadfile() {
        return result_uploadfile;
    }

    public By getResult_addfolder() {
        return result_addfolder;
    }

    public By getToast_success_createfolder() {
        return toast_success_createfolder;
    }

    public By getToast_successupload() {
        return toast_successupload;
    }

    public By getResult_addnewdoc() {
        return result_addnewdoc;
    }

    public By getToast_error_adddoc() {
        return toast_error_adddoc;
    }

    public By getToast_success_adddoc() {
        return toast_success_adddoc;
    }
}
