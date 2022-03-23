package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import staticdata.LoginData;
import staticdata.WebUrls;


import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private ElementsCollection globalFeedTitle = $$(By.xpath("//p[text()='Global feed']"));

    public void openLoginPage() {
        open(baseUrl.concat(WebUrls.LOGIN_URL));
    }

    public void login() {
        LoginData.loginButton.shouldBe(enabled);
        LoginData.emailInput.sendKeys(LoginData.EMAIL);
        LoginData.passwordInput.sendKeys(LoginData.PASSWORD);
        LoginData.loginButton.click();
    }

    public int getTitleQuantity() {
        globalFeedTitle.get(1).shouldBe(Condition.visible);
        return globalFeedTitle.size();
    }

}
