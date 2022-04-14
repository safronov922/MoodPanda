package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SupportPage {
    private SelenideElement pageTitle = $(By.xpath("//h3[contains(.,' Patron subscriber ')]"));
    private SelenideElement seeOptionsButton= $(By.xpath("(//div//a[text()='See options'])[2]"));
    private SelenideElement paimentOption = $(By.xpath("//div[@class='field mt-5 buttons is-hidden-touch']//a[text()=' £2.20 per month ']"));

    public String pageTitleText(){
        pageTitle.shouldBe(Condition.visible);
        String text = pageTitle.getText();
        return text;
    }
    public boolean displayedOptions(){
        seeOptionsButton.click();
        return paimentOption.isDisplayed();
    }
}
