package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com/", "https://www.wayfair.com/",
                "https://www.walmart.com/", "https://westelm.com/");



        for(String each: urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(each);
            String title = driver.getTitle().replaceAll(" ", "").toLowerCase();
            System.out.println(each + " Url contains title: " + each.toLowerCase().contains(title));
            driver.quit();
        }



    }
}
