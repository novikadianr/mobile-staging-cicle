package objectRepository;

import org.openqa.selenium.By;

public class teamPages {
    By btn_addteam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btn_menuaddteam = By.xpath("//android.view.View[@content-desc=\"Add new team\"]");
    By field_nameteam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By field_descteam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By btn_create_team = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");

    By toast_error_message = By.xpath("//android.view.View[@content-desc=\"Name and description fields must be filled\"]");
    By result_addteam = By.xpath("//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View");

    By list_team = By.xpath("(//android.widget.Button[@content-desc=\"Team A\n" +
            "Team A Mobile\"])[1]");

    public By getList_team() {
        return list_team;
    }

    public By getField_nameteam() {
        return field_nameteam;
    }

    public By getField_descteam() {
        return field_descteam;
    }

    public By getBtn_addteam() {
        return btn_addteam;
    }

    public By getBtn_create_team() {
        return btn_create_team;
    }

    public By getBtn_menuaddteam() {
        return btn_menuaddteam;
    }

    public By getResult_addteam() {
        return result_addteam;
    }

    public By getToast_error_message() {
        return toast_error_message;
    }
}
