import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create driver object chrome driver
		//strictly implement methods of webdriver
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.className("inputtext")).sendKeys("helloW");
		
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("12345");
		//driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2) > div:nth-child(1) > a:nth-child(1)")).click();
		//driver.close();
		
	}
}