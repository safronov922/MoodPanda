package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.SupportPage;

public class FindMoreTest extends BaseTest{
    private static final  String EMAIL ="safronov92@gmail.com";
    private static final String PASSWORD= "safronov21";
    @Test(description = "Тест проверяет открытие страницы Find More")
    public void openPageFindMoreTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL,PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickButton();
        SupportPage supportPage = new SupportPage();
        Assert.assertEquals(supportPage.pageTitleText(),"Patron subscriber");
    }
    @Test(description = "тест проверяет , что открыты опции и одна из них отображается")
    public void seeOptionsTest(){
        SupportPage supportPage = new SupportPage();
        boolean options = supportPage.displayedOptions();
        Assert.assertTrue(options,"Option don't displayed");

    }
}
