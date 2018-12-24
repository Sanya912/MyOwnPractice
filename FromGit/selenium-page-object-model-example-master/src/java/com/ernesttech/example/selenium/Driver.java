package com.ernesttech.example.selenium;

import com.ernesttech.example.selenium.page.HomePage;
import com.ernesttech.example.selenium.test.AbstractPageTest;
import com.ernesttech.example.selenium.test.HomePageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Driver {

    public static void main(String[] args) {

        // Chrome
        System.setProperty("webdriver.chrome.driver", "chromedriver-osx");

        // Firefox
        System.setProperty("webdriver.gecko.driver", "geckodriver-osx");

        // Create a new instance of the Web driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = null;

        try {
            driver = new ChromeDriver();

            AbstractPageTest homePageTest = new HomePageTest(driver, new HomePage());
            homePageTest.executeTests();

        } catch (Exception e) {

        } finally {
            if (null != driver) {
                driver.quit();
            }
        }


    }
}
