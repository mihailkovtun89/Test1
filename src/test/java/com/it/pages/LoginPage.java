package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	@FindBy(name="login")
	private WebElement login;

	@FindBy(name="pass")
	private WebElement password;

	@FindBy(xpath="//input[@tabindex = '5']")
	private WebElement loginbutton;


    public void login (String log, String pass) {
        login.sendKeys(log);
        password.sendKeys(pass);
        loginbutton.click();
    }



}
