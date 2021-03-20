package dz.qa.alibabaPages;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

public class PageInitialization extends WebAPI {
    public static HomePage homepage;

    public static void init(){
        homepage = PageFactory.initElements(driver,HomePage.class);
    }
}
