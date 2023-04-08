package com.orangeHRM.Pages;
import com.orangeHRM.DriverUtility.BrowserManager;
import com.orangeHRM.WaitFactory.WebDriverWaitManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static com.orangeHRM.DriverUtility.BrowserManager.driver;
public class SignInPage  {

    private WebDriverWait wait = new WebDriverWait(BrowserManager.driver, Duration.ofSeconds(20));
    WebDriverWaitManager wdm = new WebDriverWaitManager();
    By userNameField = By.name("username");
    By passWordField = By.name("password");
    By loginButton = By.xpath("//button[@type = \"submit\"]");


    public SignInPage enterUsername(String name) throws InterruptedException {
        Thread.sleep(5000);
        WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(userNameField));
        userName.sendKeys(name);
        return this;
    }
    public SignInPage enterPassword(String pass){
//        WebElement password = driver.findElement(passWordField);
        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(passWordField));
        password.sendKeys(pass);
        return this;
    }
    public HomePage clickLogin(){
//        WebElement button = driver.findElement(loginButton);
//        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
//        button.click();
        wdm.clickElement(loginButton);
        return new HomePage();
    }


}