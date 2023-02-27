package com.orangeHRM.WaitFactory;
import com.orangeHRM.DriverUtility.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitManager {

    WebDriverWait wait = new WebDriverWait(BrowserManager.driver, Duration.ofSeconds(20));
    public void clickElement(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    public void elementLocated(By locator){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
