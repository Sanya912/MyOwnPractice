import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xpath= //tagname[@attribute='value']
				//css== tagname[attribute='value']
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("WWWW");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pass");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		
		
		
		
		
		
		//div[class='identity first']
		//div[@class='identity first']		
				
				
				
	}

}
