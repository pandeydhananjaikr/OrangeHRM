package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.orangeHRM.DriverUtility.BrowserManager.driver;

public class Leave_Page {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    By fromDate = By.xpath("//label[text()=\"From Date\"]//..//../div/div/div/i");
    By toDate = By.xpath("//label[text()=\"To Date\"]//..//../div/div/div/i");
    By Status = By.xpath("//label[text()=\"Show Leave with Status\"]//..//../div/div/div/div/i");
    By leaveType = By.xpath("//label[text()=\"Leave Type\"]//..//../div/div/div/div/i");
    By empName = By.xpath("//label[text()=\"Employee Name\"]//..//../div[2]/div/div/input");
    By subUnit = By.xpath("//label[text()=\"Sub Unit\"]//..//../div/div/div/div/i");
    By InclPast = By.xpath("//p[text()=\"Include Past Employees\"]//../div/label/span");
    By searchB = By.xpath("//button[@type=\"submit\"]");





    public Leave_Page searchButton() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(searchB));
        button.click();
        return this;
    }




}
