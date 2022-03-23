package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.MainPage;

public class DashBoardTest extends BaseTest {

    @Test(description = "This test check, that dashboard button and page are enable and visible")
    public void dashBoardEnableTest() {
        MainPage mainPage = new MainPage();
        mainPage.openLoginPage();
        mainPage.login();
        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.clickDashBoardButton();
        dashBoardPage.dashBoardTitleEnable();
    }
}
