package com.mymaven.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mymaven.poms.CreateDefect;
import com.mymaven.poms.LoginPage;
import com.mymaven.poms.UpdateDefect;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue= "com/mymaven/steps", plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"})
public class TestRunner {

public static WebDriver driver;
public static LoginPage login;
public static CreateDefect createDefect;
public static UpdateDefect updateDefect;
public static WebDriverWait wait;

@BeforeClass
public static void setup(){
    System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
    driver = new ChromeDriver();
    login = new LoginPage(driver);
    createDefect = new CreateDefect(driver);
    updateDefect = new UpdateDefect(driver);
    wait = new WebDriverWait(driver, 2);
    
    
}


@AfterClass
public static void teardown(){
    driver.quit();
}
}
