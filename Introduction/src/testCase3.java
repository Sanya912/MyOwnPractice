import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create driver object direfox driver
		//strictly implement methods of webdriver
		//invoke .exe file first
		
		System.setProperty("webdriver.ie.driver", "C:\\Windows\\System32\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new InternetExplorerDriver ();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
	
	
	
	
	}
}
