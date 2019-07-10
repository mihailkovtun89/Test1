package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboardpages extends BasePage {
	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement lbEmail;


    public String getLbEmail () {

        WebDriverWait wait = new WebDriverWait(driver,10);

        return wait.until(ExpectedConditions.visibilityOf(lbEmail)).getText();
    }

}
