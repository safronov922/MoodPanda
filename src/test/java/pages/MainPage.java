package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private ElementsCollection globalFeedTitle = $$(By.xpath("//p[text()='Global feed']"));
    private SelenideElement buttonFindOutMore = $(By.xpath("//a[contains(text(),' Find out more ')]"));
    private SelenideElement buttonPostUpdate = $(By.xpath("//a[text()='Post update']"));

    public int getTitleQuantity(){
        globalFeedTitle.get(1).shouldBe(visible);
        return  globalFeedTitle.size();
    }
    public void clickButton(){
        buttonFindOutMore.click();
    }
    public void clicklButtonPost(){
        buttonPostUpdate.click();
    }
}
