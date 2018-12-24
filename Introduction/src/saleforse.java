import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleforse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("saaaaaha");
		driver.findElement(By.cssSelector("#password")).sendKeys("12222211");
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		driver.close();
		
	}

}
