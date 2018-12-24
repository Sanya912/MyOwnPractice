import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create driver object direfox driver
		//strictly implement methods of webdriver
		//invoke .exe file first
		
		System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
	
	
	
	
	}
}
