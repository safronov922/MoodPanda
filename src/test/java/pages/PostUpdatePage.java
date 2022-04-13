package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostUpdatePage {
    private SelenideElement tenButton = $(By.xpath("//div[@class='buttons hdas-addons is-hidden-touch']//button[text()=' 10 ']"));
    private SelenideElement mood = $(By.xpath("//button[text()=' no reason ']"));
    private SelenideElement buttonSave = $ (By.xpath("//a[text()= ' Update to 10']"));
    private SelenideElement textArea = $(By.tagName("textarea"));
    private SelenideElement moodUpdate = $(By.xpath("//p[text()='Mood updated']"));

    public void  createPost(String text){
        tenButton.click();
        mood.click();
        textArea.sendKeys(text);
        buttonSave.click();
    }
    public String getMoodUpdateTest(){
        moodUpdate.shouldBe(Condition.visible);
        return moodUpdate.getText();
    }

}
