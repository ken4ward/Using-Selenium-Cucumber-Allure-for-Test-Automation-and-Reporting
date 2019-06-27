package com.fblogin.tests.testcases;

import com.fblogin.tests.init.Init;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.fblogin.testrunner.TestRunners;

public class TestCases extends Init {

    public TestCases(){}
    public TestCases( WebDriver driver ) { super(driver); }

    public static void assertProject(String myprops, String props ) throws Throwable {
        String facebook = driver.findElement(By.cssSelector(myValues(myprops))).getText();
        Assert.assertEquals(facebook, getProperties().getProperty(props));
    }

    public static void validateFbPage() throws Throwable {
        assertProject("facebook.greetings.class", "facebook.greetings");
    }

    private static void insertValues(String field, String value ) throws Throwable {
        driver.findElement(By.cssSelector(myValues(field))).clear();
        driver.findElement(By.cssSelector(myValues(field))).sendKeys(myValues(value));
    }

    public static void firstname () throws Throwable {
        insertValues("springboard.firstname.field", "springboard.username");
    }

    public static void lastname () throws Throwable {
        insertValues("springboard.lastname.field", "springboard.password");
    }

    public static void country () throws Throwable {
        Select drpCountry = new Select(driver.findElement(By.cssSelector("#country")));
        drpCountry.selectByVisibleText("USA");
    }

    public static void message () throws Throwable {
        insertValues("springboard.message.field", "springboard.message");
    }

    public static void submitButton () throws Throwable {
        driver.findElement(By.cssSelector(myValues("springboard.submit"))).click();
    }

    public static void pageValidate() throws Throwable {
        Assert.assertEquals("Macaulay", driver.findElement(By.id("display_fname")).getText());
        Assert.assertEquals("Bowden", driver.findElement(By.id("display_lname")).getText());
        Assert.assertEquals("USA", driver.findElement(By.id("display_country")).getText());
        Assert.assertEquals("Hey there!", driver.findElement(By.id("display_subject")).getText());
    }

    private static String myValues(String values) throws Throwable {
       return TestRunners.getProperties().getProperty(values );
    }
}
