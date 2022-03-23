package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import staticdata.WebTimeouts;
import staticdata.WebUrls;

public class BaseTest {

    @BeforeClass
    public void setUp(){
        Configuration.timeout = WebTimeouts.ELEMENT_LOAD_TIMEOUT;
        Configuration.baseUrl = WebUrls.BASE_URL;
        Configuration.startMaximized = true;
    }

    @AfterClass
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
