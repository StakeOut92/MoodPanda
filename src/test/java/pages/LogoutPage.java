package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import staticdata.LoginData;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class LogoutPage extends MainPage{
    private SelenideElement logOutButton = $(By.xpath("//div[@class='buttons']//a[contains(.,'Logout')]"));

    public void clickLogoutButton(){
        logOutButton.click();
    }

    public void checkLoginButtonEnable(){
        LoginData.loginButton.shouldBe(enabled);
    }
}

