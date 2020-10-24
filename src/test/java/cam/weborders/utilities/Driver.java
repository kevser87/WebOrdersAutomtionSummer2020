package cam.weborders.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //reference variable ,pointer on object
    // if reference variable doesn't point any object it will have  a null value\
    //Whenever we type new class()-we create a new abject
    //reference type can be class, or interface implemented by class or parent
    private static WebDriver driver;
    private Driver(){}
    public static WebDriver getDriver(){
        if(driver== null){
            String browser="chrome";
            switch (browser){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Browser is not implemented yet: " + browser);
            }
        }
        return driver;
    }
}
