package main;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.welcome_page.WelcomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Main {
    public WebDriver driver;
    protected WelcomePage welcomePage;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        goHome();
    }
    @BeforeMethod
    public void goHome(){
        welcomePage = new WelcomePage(driver);
        driver.get("https://www.demo.guru99.com/V4/");
    }
    @AfterClass
    public  void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void recordFailure (ITestResult result) {
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/ScreenShots/"+ result.getName() + ".png"));
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
