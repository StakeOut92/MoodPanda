package staticdata;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LoginData {
    public static final String EMAIL = "anyway123@yopmail.com";
    public static final String PASSWORD = "Lostsoul_92";
    public static final SelenideElement emailInput = $(By.xpath("//input[@placeholder='MoodPanda registered email ']"));
    public static final SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    public static final SelenideElement loginButton = $(By.xpath("//button[contains(.,'Login')]"));
}
