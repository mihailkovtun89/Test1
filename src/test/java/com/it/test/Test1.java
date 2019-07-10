package com.it.test;

import com.it.Entity.User;
import com.it.Entity.UserFactory;
import com.it.pages.Dashboardpages;
import com.it.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {

    @Test
    public void testTest1() throws InterruptedException {
        app.login.login(validUser.getLogin(),validUser.getPass());
        Thread.sleep(1000);
        Assert.assertEquals(app.dashdoard.getLbEmail(), validUser.getEmail(), "Email is not valid");

    }
}
