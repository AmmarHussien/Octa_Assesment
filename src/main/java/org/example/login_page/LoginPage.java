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
        sendKeys(userId , userName);
    }
    public String getUserID() {
        return getTexts(userId);
    }
    public String getUserNameValidationMassage(){
        return getTexts(userIdValidation);
    }
    public void clickUserID() {
        click(userId);
    }
    public void setPassword(String password) {
        sendKeys(userPassword , password);
    }
    public String getUserPasswordValidationMassage(){
        return getTexts(userPasswordValidation);
    }
    public String getUserPassword() {
        return getTexts(userPassword);
    }
    public void clickSubmit() {
        click(submitButton);
    }
    public void clickPassword() {
        click(userPassword);
    }
    public void clickReset() {
        click(resetButton);
    }
    public String getText(){
        //return driver.findElement(homePageText).getText();
        return getTexts(homePageText);
    }
    public void alert_Click(){
        driver.switchTo().alert().accept();
    }
    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }




    public void click (By clicks) {
        driver.findElement(clicks).click();
    }
    public void sendKeys (By element, String sendKey) {
        driver.findElement(element).sendKeys(sendKey);
    }
    public String getTexts (By element) {
        return driver.findElement(element).getText();
    }
}
