package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginpage;

public class LoginApplication {
	//Login page class implemented in normal page object pattern style
	//Home page class implemented in Page object factory methods
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.Email().sendKeys("Hello");
		rd.Password().sendKeys("TRASSSSH");
		rd.Submit().click();
		rd.HomeLink().click();
		
		RediffHomePage rh=new RediffHomePage(driver);
		rh.Videos().click();
		
		
	}
	

}
