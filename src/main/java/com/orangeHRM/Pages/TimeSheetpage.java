package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.orangeHRM.DriverUtility.BrowserManager.driver;

public class TimeSheetpage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    By empName = By.xpath("//label[text()=\"Employee Name\"]//..//../div[2]/div/div/input");
    By viewButton = By.linkText(" View ");

    public TimeSheetpage ViewByEmpName(String name){
        WebElement empname = wait.until(ExpectedConditions.presenceOfElementLocated(empName));
        empname.sendKeys("name");
        return this;
    }

    public TimeSheetpage viewButton(){
        WebElement viewbtn = wait.until(ExpectedConditions.elementToBeClickable(viewButton));
        viewbtn.click();
        return this;
    }












}
