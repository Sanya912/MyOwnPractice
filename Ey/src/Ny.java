import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ny {
	
	

	public static void main(String[] args) {
		WebDriver browser;   

		System.setProperty("webdriver.gecko.driver","/Users/jimholmes/Utils/geckodriver");   

		browser = new FirefoxDriver();    browser.get("http://saucelabs.com");  
		// TODO Auto-generated method stub
System.out.print("EYOO");
	}

	



}
