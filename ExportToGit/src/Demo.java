
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create driver object chrome driver
		//strictly implement methods of webdriver
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); //validate if your page is correct
		System.out.println(driver.getCurrentUrl()); //validate if current url
		
		//System.out.println(driver.getPageSource()); //print source code
		driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.close(); //close current browser
		//driver.quit(); //close all browsers
	 
	
	
	
	}
}
