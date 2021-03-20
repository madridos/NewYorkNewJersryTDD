package dz.qa.alibabaTest;

import dz.qa.alibabaPages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static dz.qa.alibabaPages.PageInitialization.*;

public class SearchBoxTests {

    @Test
    public void search_Box_Without_Login_Text_Field_Test(){
        init();
    homepage.search_Box_Without_Login_Text_Field();
    }
}
