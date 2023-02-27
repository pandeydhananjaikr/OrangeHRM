package com.orangeHRM.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static com.orangeHRM.DriverUtility.BrowserManager.driver;
public class PIM_Page {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
    private By empName = By.xpath("//Label[text()= \"Employee Name\"]//..//../div[2]/div/div/input");
    private By  empStatus = By.xpath("//label[text()=\"Employment Status\"]/    By empID = By.xpath(\"//Label[text()= \\\"Employee Id\\\"]//..//../div[2]/input\");\n/..//..//../div[2]/div/div/div[2]/i");
    // "//div[@class = "oxd-select-text-input" and text() = "Full-Time Contract"]"
    private By empInclude = By.xpath("//label[text()=\"Include\"]//..//..//../div/div/div/div[2]/i");
    private By empSupervisor = By.xpath("//label[text()=\"Supervisor Name\"]//..//../div[2]/div/div/input");
    private By jobTitle = By.xpath("//label[text()=\"Job Title\"]//..//../div[2]/div/div/div/i");
    private By subUnit = By.xpath("//label[text()=\"Sub Unit\"]//..//../div/div/div[2]/input");
    private By searchClick = By.xpath("//button[@type= \"submit\"]");

    public PIM_Page SearchByEmpName(String employeeName){
        WebElement emplName = wait.until(ExpectedConditions.presenceOfElementLocated(empName));
        emplName.sendKeys(employeeName);
        return this;
    }

    public PIM_Page searchButton(){
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(searchClick));
        button.click();
        return this;
    }







}
