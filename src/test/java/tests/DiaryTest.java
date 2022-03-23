package tests;


import org.testng.annotations.Test;
import pages.DiaryPage;
import pages.MainPage;

public class DiaryTest extends BaseTest {

    @Test(description = "Check that diary button is enable and diary page is enable")
    public void diaryPageEnableTest() {
        MainPage mainPage = new MainPage();
        mainPage.openLoginPage();
        mainPage.login();
        DiaryPage diaryPage = new DiaryPage();
        diaryPage.clickDiaryButton();
        diaryPage.checkDiaryBoxEnable();
    }
}
