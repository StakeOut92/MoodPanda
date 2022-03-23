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

public class DiaryPage extends MainPage {
    private SelenideElement diaryButton = $(By.xpath("//a[contains(.,' Your diary ')]"));
    private SelenideElement diaryBox = $(By.xpath("//p[@class='box' and contains(.,' There are no posts to show. ')]"));

    public void clickDiaryButton() {
        diaryButton.click();
    }

    public void checkDiaryBoxEnable() {
        diaryBox.shouldBe(visible);
    }
}
