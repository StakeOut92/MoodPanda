package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import staticdata.LoginData;
import staticdata.WebUrls;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * LoginPage class it is Page Object realisation of login page
 *
 * @author Evgeny I
 *
 */

public class LoginPage {

    /**
     * Email input field
     */
    private SelenideElement emailInput = $(By.xpath("//input[@placeholder='MoodPanda registered email ']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));


    public void openLoginPage(){
        open(baseUrl.concat(WebUrls.LOGIN_URL));
    }

    /**
     * Method performs login to Mood Panda
     */

    public void login(){
        LoginData.loginButton.shouldBe(enabled);
        emailInput.sendKeys(LoginData.EMAIL);
        passwordInput.sendKeys(LoginData.PASSWORD);
        LoginData.loginButton.click();
    }
}
