package org.example.welcome_page;

import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    static WebDriver driver;
    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage login() {
        return new LoginPage(driver);
    }

    public NewCustomer addNewCustomer() {
        driver.findElement(By.linkText("New Customer")).click();
        return new NewCustomer(driver);
    }
}