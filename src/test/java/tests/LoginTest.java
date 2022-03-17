package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest{
    private static final  String EMAIL ="safronov92@gmail.com";
    private static final String PASSWORD= "safronov21";

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL,PASSWORD);
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(), 2,"Quantity of titles isn't expected");
    }
}
