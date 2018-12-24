import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;   

		  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		driver = new ChromeDriver();    driver.get("http://saucelabs.com");   
		
		
	}

}
