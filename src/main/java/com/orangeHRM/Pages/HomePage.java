package com.orangeHRM.Pages;

import com.orangeHRM.DriverUtility.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    By PIM_Locator = By.linkText("PIM");
    By Leave_Locator = By.linkText("Leave");
    By Time_Locator = By.linkText("Time");
    WebDriverWait wait = new WebDriverWait(BrowserManager.driver, Duration.ofSeconds(20));
    public void selectPIM(){
        WebElement PimElement = wait.until(ExpectedConditions.elementToBeClickable(PIM_Locator));
        PimElement.click();
    }
    public void selectLeave(){
        WebElement LeaveElement = wait.until(ExpectedConditions.elementToBeClickable(Leave_Locator));
        LeaveElement.click();
    }

    public void selectTime(){
        WebElement timeElement = wait.until(ExpectedConditions.elementToBeClickable(Time_Locator));
        timeElement.click();
    }






}
