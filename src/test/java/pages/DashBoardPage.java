package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import staticdata.LoginData;
import staticdata.WebUrls;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DashBoardPage extends MainPage {


    private SelenideElement dashBoardButton = $(By.xpath("//a[contains(.,' Your dashboard ')]"));
    private SelenideElement dashBoardTitle = $(By.xpath("//p[@class='title']"));

    public void openLoginPage() {
        open(baseUrl.concat(WebUrls.LOGIN_URL));
    }

    public void login() {
        LoginData.loginButton.shouldBe(enabled);
        LoginData.emailInput.sendKeys(LoginData.EMAIL);
        LoginData.passwordInput.sendKeys(LoginData.PASSWORD);
        LoginData.loginButton.click();
    }

    public void clickDashBoardButton() {
        dashBoardButton.click();
    }

    public void dashBoardTitleEnable() {
        dashBoardTitle.shouldBe(visible);
    }
}
