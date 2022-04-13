package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PostUpdatePage;

public class MoodUpdateTest extends BaseTest{
    private static final  String EMAIL ="safronov92@gmail.com";
    private static final String PASSWORD= "safronov21";
    @Test(description = "Тест проверяет добавление настроения")
    public void updateOfMoodeTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL,PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clicklButtonPost();
        PostUpdatePage postUpdatePage = new PostUpdatePage();
        postUpdatePage.createPost("#Test");
        Assert.assertEquals(postUpdatePage.getMoodUpdateTest(), "Mood updated");
    }
}
