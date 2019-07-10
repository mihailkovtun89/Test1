package com.it.test;

import com.it.App;
import com.it.Entity.User;
import com.it.Entity.UserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    User validUser = UserFactory.getValidUser();
    App app = new App();

    @AfterSuite
    public void tearDown() {
        app.common.stopApp();
    }
}
