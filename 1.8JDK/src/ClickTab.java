import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/");
		driver.findElement(By.xpath("//*[@id=\'loginForm.loginId\']")).click();
		driver.findElement(By.xpath("//*[@id=\'loginForm.loginId\']")).sendKeys(Keys.TAB);
		
		
		
		
		
	}

}
