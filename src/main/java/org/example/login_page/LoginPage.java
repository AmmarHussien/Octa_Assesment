package org.example.login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver ;
    }
    private final By userId = By.name("uid");
    private final By userPassword = By.name("password");
    private final By submitButton = By.name("btnLogin");
    private final By resetButton = By.name("btnReset");
    private final By userIdValidation =By.id("message23");
    private final By userPasswordValidation = By.id("message18");

    private final By homePageText = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");

    public void setUserId(String userName) {
        driver.findElement(userId).sendKeys(userName);
    }
    public String getUserID() {
        return driver.findElement(userId).getText();
    }
    public String getUserNameValidationMassage(){
        return driver.findElement(userIdValidation).getText();
    }
    public void clickUserID() {
        driver.findElement(userId).click();
    }
    public void setPassword(String password) {
        driver.findElement(userPassword).sendKeys(password);
    }
    public String getUserPasswordValidationMassage(){
        return driver.findElement(userPasswordValidation).getText();
    }
    public String getUserPassword() {
        return driver.findElement(userPassword).getText();
    }
    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }
    public void clickPassword() {
        driver.findElement(userPassword).click();
    }
    public void clickReset() {
        driver.findElement(resetButton).click();
    }
    public String getText(){
        return driver.findElement(homePageText).getText();
    }
    public void alert_Click(){
        driver.switchTo().alert().accept();
    }

}
