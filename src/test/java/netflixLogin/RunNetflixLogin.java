package netflixLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;


public class RunNetflixLogin {


    @Test
    void wog() {
        WebDriver driver = BrowserFactory.openbrowser("chrome", "https://www.netflix.com");

        BeginNetflixLogin run = PageFactory.initElements(driver, BeginNetflixLogin.class);
        run.LogIn("wolverinx@gmail.com", "newpassowlv12");

    }
}
