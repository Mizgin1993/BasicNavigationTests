package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();

        Thread.sleep(1000);
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();

        Thread.sleep(1000);

        driver.navigate().to("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        String url3 = driver.getCurrentUrl();

        StringUtility.verifyEquals(title1, title2);
        StringUtility.verifyEquals(title2, title3);

        String word = "http://practice.cybertekschool.com/";
       StartsWithUrl.StartsWith(url1, word);
       StartsWithUrl.StartsWith(url2, word);
       StartsWithUrl.StartsWith(url3, word);



        driver.quit();








    }
}
