import static org.junit.Assert.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Test;

public class CheckSauceLabsHomePage {

 void site_header_is_on_home_page() {   
	WebDriver browser;   

	  
	
	System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
	browser = new ChromeDriver();    browser.get("http://saucelabs.com");   




	}

	}