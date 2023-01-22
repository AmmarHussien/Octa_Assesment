package org.example.welcome_page;

import org.example.login_page.LoginPage;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    static WebDriver driver;
    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage Login() {
        return new LoginPage(driver);
    }
}