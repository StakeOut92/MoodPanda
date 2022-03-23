package tests;

import org.testng.annotations.Test;
import pages.LogoutPage;
import pages.MainPage;

public class LogoutTest extends BaseTest{

    @Test(description = "After login check that logout button is enable and return to login page")
    public void logoutTest(){
        MainPage mainPage = new MainPage();
        mainPage.openLoginPage();
        mainPage.login();
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.clickLogoutButton();
        logoutPage.checkLoginButtonEnable();
    }
}
