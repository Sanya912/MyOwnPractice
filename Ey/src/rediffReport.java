
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		long startTime = System.nanoTime();
		
	
		driver.get("http://rediff.com");
		
		
		driver.findElement(By.cssSelector("a[title*='Sign in'")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("wertyuio");
		
		
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();
		
		driver.close();
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		double sec =  totalTime/ 1000000000;
		System.out.println(sec);
		
		
	}

}
