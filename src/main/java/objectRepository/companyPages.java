package objectRepository;

import org.openqa.selenium.By;

public class companyPages {
    By btn_create_company = By.xpath("//android.widget.Button[@content-desc=\"Create New Company\"]");
    By field_companyname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By field_companydesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By btn_create = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By toast_success_create = By.xpath("//android.view.View[@content-desc=\"Successfully create company user\"]");
    By toast_error_create = By.xpath("//android.view.View[@content-desc=\"Name and description fields must be filled\"]");
    By list_company = By.xpath("//android.view.View[@content-desc=\"Testing Mobile\"]");
    By result_create_comp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public By getList_company() {
        return list_company;
    }

    public By getBtn_create_company() {
        return btn_create_company;
    }

    public By getBtn_create() {
        return btn_create;
    }

    public By getField_companydesc() {
        return field_companydesc;
    }

    public By getField_companyname() {
        return field_companyname;
    }

    public By getResult_create_comp() {
        return result_create_comp;
    }

    public By getToast_error_create() {
        return toast_error_create;
    }

    public By getToast_success_create() {
        return toast_success_create;
    }
}
