import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Enter letters
//verify if Airport ...
public class Autosssug {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//*[@id=\'fromPlaceName\']")).sendKeys("BENG");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'fromPlaceName\']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\'fromPlaceName\']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//*[@id=\'fromPlaceName\']")).getText());
		
		//JavaScript DOM can extract hidden elements
		//Selenium cannot hidden Elements
		
		//We can use JavaScript Executor in JAVA
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script =  "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		
		
		//BENGALURU INTERNATION AIPORT
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPOR"))
		{
			i++;
			driver.findElement(By.xpath("//*[@id=\'fromPlaceName\']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
				
			}
		}
		if(i>10)
		{
			System.out.println("Element not found");
		}
		}
		
	}
	


