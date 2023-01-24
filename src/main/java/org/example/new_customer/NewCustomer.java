package org.example.new_customer;

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
        sendKeys(customerName,name);
    }
    public String getCustomerNameValidation (){
        return getTexts(customerNameValidation);
    }
    public String getCustomerName() {
        return getTexts(customerName);
    }
    public void setCustomerGender (String gender) {
        int i;
        final By genders ;
        if(gender.equals("m")) {
            i = 1;
            genders = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input["+i+"]");
            click(genders);
        } else if (gender.equals("f")) {
            i = 2;
            genders = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input["+i+"]");
            click(genders);
        }
    }
    public void setCustomerDateOfBirth (String date) {
        sendKeys(dateOfBirth,date);
    }
    public String getCustomerDateOfBirthValidation () {
        return getTexts(customerDateOfBirthValidation);
    }
    public String getCustomerDateOfBirth() {
        return getTexts(customerDateOfBirthValidation);
    }
    public void setCustomerAddress (String address) {
        sendKeys(customerAddress,address);
    }
    public String getCustomerAddressValidation () {
        return getTexts(customerAddressValidation);
    }
    public String getCustomerAddress() {
        return getTexts(customerAddress);
    }

    public void setCustomerCity (String city) {
        sendKeys(customerCity,city);
    }
    public String getCustomerCityValidation () {
        return getTexts(customerCityValidation);
    }
    public String getCustomerCity() {
        return getTexts(customerCity);
    }

    public void setCustomerState(String state) {
        sendKeys(customerState , state);
    }
    public String getCustomerStateValidation () {
        return getTexts(customerStateValidation);
    }
    public String getCustomerState() {
        return getTexts(customerState);
    }

    public void setCustomerPIN(String pin) {
        sendKeys(customerPIN,pin);
    }
    public String getCustomerPinValidation () {
        return getTexts(customerPINValidation);
    }
    public String getCustomerPIN() {
        return getTexts(customerPIN);
    }

    public void setCustomerPhoneNumber(String number) {
        sendKeys(customerPhoneNumber,number);
    }
    public String getCustomerPhoneValidation () {
        return getTexts(customerPhoneNumberValidation);
    }
    public String getCustomerPhoneNumber() {
        return getTexts(customerPhoneNumber);
    }

    public void setCustomerEmail(String email) {
        sendKeys(customerEmail,email);
    }
    public String getCustomerEmailValidation () {
        return getTexts(customerEmailValidation);
    }
    public String getCustomerEmail() {
        return getTexts(customerEmail);
    }

    public void setCustomerPassword(String password) {
        sendKeys(customerPassword,password);
    }
    public String getCustomerPasswordValidation () {
        return getTexts(customerPasswordValidation);
    }
    public String getCustomerPassword() {
        return getTexts(customerPassword);
    }

    public void clickSubmitButton() {
        click(submitButton);
    }
    public void clickResetButton() {
        click(resetButton);
    }
    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }
    public void alert_Click(){
        driver.switchTo().alert().accept();
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

