
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class regularExpression {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dice.com/dashboard/profiles/active");
		//driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("YYYESSS"); //regularExpression if changing xpath  everytime
		//driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		

	}

}








		