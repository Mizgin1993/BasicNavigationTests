package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    /*
    1. Openbrowser
2. Go to website https://google.com
3. Savethetitleinastringvariable
4. Gotohttps://etsy.com
5. Savethetitleinastringvariable
6. Navigatebacktopreviouspage
7. Verifythattitleissameisinstep3
8. Navigateforwardtopreviouspage
9. Verifythattitleissameisinstep5

     */
    public static void main(String[] args) {

    }
    public static void Chrome(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title1, title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2, title4);
        driver.close();
    }
    public static void Safari(){
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title1, title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2, title4);
        driver.close();
    }
    public static void Firefox() {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title1, title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2, title4);
        driver.close();
    }
}
