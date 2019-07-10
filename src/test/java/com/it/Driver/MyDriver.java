package com.it.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyDriver extends RemoteWebDriver {

    private static MyDriver myDriver;
    private RemoteWebDriver driver;

    public static MyDriver myDriver () {
        if (myDriver == null)
            myDriver = new MyDriver();
        return myDriver;

    }

    private MyDriver() {
        driver = DriverFactory.getDriver();
    }
    /**
     *  * Scroll Up  */
    public void scrollUp() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");  }
        /**  * Scroll Down  */
        public void scrollDown() {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");  }
    /**
     * * Scroll  to Element  *  * @param element  */
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    try {         Thread.sleep(500);     }
    catch (InterruptedException e)


    {         e.printStackTrace();     } }

}
