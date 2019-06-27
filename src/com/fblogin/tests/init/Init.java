package com.fblogin.tests.init;

import com.fblogin.utility.PropertiesFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Properties;

public class Init {

    public static WebDriver driver;

    public Init(){}
    public Init(WebDriver _driver) {
        this.driver = _driver;
    }
    static PropertiesFileReader propertiesFileReader = new PropertiesFileReader();

    public static Properties getProperties() throws Throwable {
        Properties properties = propertiesFileReader.getProperties();
        return properties;
    }

    public static void initProperties() throws Throwable {
//        System.setProperty("webdriver.gecko.driver", "geckodriver");
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getProperties().getProperty("browser.baseURL"));
        Thread.sleep(3000);
    }
}
