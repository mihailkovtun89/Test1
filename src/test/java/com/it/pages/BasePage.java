package com.it.pages;

import com.it.Common.Constants;
import com.it.Driver.DriverFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());

    protected static WebDriver driver = DriverFactory.getDriver();



    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}


