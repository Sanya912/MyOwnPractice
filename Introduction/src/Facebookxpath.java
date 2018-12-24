import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		//  //tagName[@attribute='value'] - xpath syntax OWN
		/*driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("myxpath");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Blalla");
		driver.findElement(By.xpath("//input[@value=\'Log In\']")).click();
		*/
		
		//tagName[attribute='value'] - CSS syntax OWN
		driver.findElement(By.cssSelector("input#email")).sendKeys("myown css");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		driver.findElement(By.cssSelector("Log In")).click();
		//driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}
