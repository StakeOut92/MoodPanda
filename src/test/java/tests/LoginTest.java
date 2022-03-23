package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest{

    @Test(description = "This test check that login page is enable and login is successful")
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(),2,"Quantity of title isn't expected");
    }
}
