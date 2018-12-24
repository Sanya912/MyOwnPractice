package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.chromeDriver;

public class fr {

	public static void(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.id("email")).sendKeys("MyEmail");
		driver.findElement(By.id("pass")).sendKeys("MyPassword");
		driver.findElement(By.id("u_0_2")).click();
		
		
	}
	
	
	
	
}
