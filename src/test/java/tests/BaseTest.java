package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import staticdata.WebTimouts;
import staticdata.WebUrls;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        Configuration.timeout = WebTimouts.ELEMENT_LOAD_TIMEOUT;
        Configuration.baseUrl = WebUrls.BASE_URL;
        Configuration.startMaximized = true;
    }
    @AfterClass
    public  void tearDown(){
        closeWebDriver();

    }
}
