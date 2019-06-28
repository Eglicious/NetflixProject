package netflixLogin;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.io.IOException;

public class BeginNetflixLogin {

    WebDriver driver;

    //@FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div[1]/div/a")
    @FindBy(how = How.XPATH, using = "//*[@id=\"appMountPoint\"]/div/div/div/div/div[1]/div/a")
    WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[1]/div/div/label/label")
    WebElement emailInputClick;


    @FindBy(how = How.XPATH, using = "//*[@id=\"id_userLoginId\"]")
    WebElement emailInputLable;

    @FindBy(how = How.XPATH, using = "//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[2]/div[1]/div/label/label")
    WebElement passInputClick;


    @FindBy(how = How.XPATH, using = "//*[@id=\"id_password\"]")
    WebElement passInputLable;

    @FindBy(how = How.XPATH, using = "//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[3]/div/label/span")
    WebElement rememberPassCheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")
    WebElement logInButton;

    public BeginNetflixLogin(WebDriver driver){
        this.driver = driver;

    }

    public void LogIn(String email, String pass){

        signInButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        emailInputClick.click();
        emailInputLable.sendKeys(email);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        passInputClick.click();
        passInputLable.sendKeys(pass);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rememberPassCheckBox.click();
        logInButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String tit = driver.getTitle();
        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\13018\\IdeaProjects\\NetflixProject\\ScreenShoots\\"+tit + "NetFlex1.png");

        try {
            FileUtils.copyFile (scr,dest);


        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.close();

    }
}
