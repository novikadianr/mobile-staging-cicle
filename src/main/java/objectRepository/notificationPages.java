package objectRepository;

import org.openqa.selenium.By;

public class notificationPages {
    By menu_notification = By.xpath("//android.view.View[@content-desc=\"1\n" +
            "Notification\n" +
            "Tab 2 of 4\"]");

    By menu_allnotif = By.xpath("//android.view.View[@content-desc=\"All\"]");
    By list_notif = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");

    By menu_allunread = By.xpath("//android.view.View[@content-desc=\"All Unread\"]");
    By null_notif = By.xpath("//android.widget.ImageView[@content-desc=\"All set\n" +
            "Your newest notification will appear here\"]");
    By list_notif_unread = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View");

   By btn_filter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]");
   By field_search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
   By result_filter = By.xpath("");

    public By getBtn_filter() {
        return btn_filter;
    }

    public By getList_notif() {
        return list_notif;
    }

    public By getMenu_notification() {
        return menu_notification;
    }

    public By getNull_notif() {
        return null_notif;
    }

    public By getList_notif_unread() {
        return list_notif_unread;
    }

    public By getField_search() {
        return field_search;
    }

    public By getMenu_allnotif() {
        return menu_allnotif;
    }

    public By getMenu_allunread() {
        return menu_allunread;
    }

    public By getResult_filter() {
        return result_filter;
    }
}
