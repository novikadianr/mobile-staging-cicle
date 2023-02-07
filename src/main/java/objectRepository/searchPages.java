package objectRepository;

import org.openqa.selenium.By;

public class searchPages {
    By menu_search = By.xpath("//android.view.View[@content-desc=\"Search\n" +
            "Tab 3 of 4\"]");
    By field_searching = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
    By result_searching = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");

    By search_team1 = By.xpath("(//android.view.View[@content-desc=\"Team A\"])[1]");
    By resulttab_team1 = By.xpath("//android.view.View[@content-desc=\"Team A\"]");

    public By getSearch_team1() {
        return search_team1;
    }

    public By getResulttab_team1() {
        return resulttab_team1;
    }

    public By getField_searching() {
        return field_searching;
    }

    public By getMenu_search() {
        return menu_search;
    }

    public By getResult_searching() {
        return result_searching;
    }
}
