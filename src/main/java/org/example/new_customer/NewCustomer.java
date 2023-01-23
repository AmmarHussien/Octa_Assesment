package org.example.new_customer;

import org.example.welcome_page.WelcomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomer {
    WebDriver driver;
    public NewCustomer(WebDriver driver) {
        this.driver = driver;
    }

    private final By customerName = By.name("name");
    private final By customerNameValidation = By.id("message");
    private final By dateOfBirth = By.id("dob");
    private final By customerDateOfBirthValidation = By.id("message24");
    private final By customerAddress = By.name("addr");
    private final By customerAddressValidation = By.id("message3");
    private final By customerCity = By.name("city");
    private final By customerCityValidation = By.id("message4");
    private final By customerState = By.name("state");
    private final By customerStateValidation = By.id("message5");
    private final By customerPIN = By.name("pinno");
    private final By customerPINValidation = By.id("message6");
    private final By customerPhoneNumber = By.name("telephoneno");
    private final  By customerPhoneNumberValidation = By.id("message7");
    private final By customerEmail = By.name("emailid");
    private final By customerEmailValidation = By.id("message9");
    private final By customerPassword = By.name("password");
    private final By customerPasswordValidation = By.id("message18");
    private final By submitButton = By.name("sub");
    private final By resetButton = By.name("res");


    public void setCustomerName (String name) {
        driver.findElement(customerName).sendKeys(name);
    }
    public String getCustomerNameValidation (){
        return driver.findElement(customerNameValidation).getText();
    }
    public String getCustomerName() {
        return driver.findElement(customerName).getText();
    }
    public void setCustomerGender (String gender) {
        int i;
        final By genders ;
        if(gender.equals("m")) {
            i = 1;
            genders = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input["+i+"]");
            driver.findElement(genders).click();
        } else if (gender.equals("f")) {
            i = 2;
            genders = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input["+i+"]");
            driver.findElement(genders).click();
        }
    }
    public void setCustomerDateOfBirth (String date) {
        driver.findElement(dateOfBirth).sendKeys(date);
    }
    public String getCustomerDateOfBirthValidation () {
        return driver.findElement(customerDateOfBirthValidation).getText();
    }
    public String getCustomerDateOfBirth() {
        return driver.findElement(customerDateOfBirthValidation).getText();
    }
    public void setCustomerAddress (String address) {
        driver.findElement(customerAddress).sendKeys(address);
    }
    public String getCustomerAddressValidation () {
        return driver.findElement(customerAddressValidation).getText();
    }
    public String getCustomerAddress() {
        return driver.findElement(customerAddress).getText();
    }

    public void setCustomerCity (String city) {
        driver.findElement(customerCity).sendKeys(city);
    }
    public String getCustomerCityValidation () {
        return driver.findElement(customerCityValidation).getText();
    }
    public String getCustomerCity() {
        return driver.findElement(customerCity).getText();
    }

    public void setCustomerState(String state) {
        driver.findElement(customerState).sendKeys(state);
    }
    public String getCustomerStateValidation () {
        return driver.findElement(customerStateValidation).getText();
    }
    public String getCustomerState() {
        return driver.findElement(customerState).getText();
    }

    public void setCustomerPIN(String pin) {
        driver.findElement(customerPIN).sendKeys(pin);
    }
    public String getCustomerPinValidation () {
        return driver.findElement(customerPINValidation).getText();
    }
    public String getCustomerPIN() {
        return driver.findElement(customerPIN).getText();
    }

    public void setCustomerPhoneNumber(String number) {
        driver.findElement(customerPhoneNumber).sendKeys(number);
    }
    public String getCustomerPhoneValidation () {
        return driver.findElement(customerPhoneNumberValidation).getText();
    }
    public String getCustomerPhoneNumber() {
        return driver.findElement(customerPhoneNumber).getText();
    }

    public void setCustomerEmail(String email) {
        driver.findElement(customerEmail).sendKeys(email);
    }
    public String getCustomerEmailValidation () {
        return driver.findElement(customerEmailValidation).getText();
    }
    public String getCustomerEmail() {
        return driver.findElement(customerEmail).getText();
    }

    public void setCustomerPassword(String password) {
        driver.findElement(customerPassword).sendKeys(password);
    }
    public String getCustomerPasswordValidation () {
        return driver.findElement(customerPasswordValidation).getText();
    }
    public String getCustomerPassword() {
        return driver.findElement(customerPassword).getText();
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }
    public void clickResetButton() {
        driver.findElement(resetButton).click();
    }
    public void alert_Click(){
        driver.switchTo().alert().accept();
    }
}

