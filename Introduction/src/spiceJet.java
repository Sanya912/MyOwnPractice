import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class spiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();;
		
		driver.get("http://spicejet.com");
		
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		// css not working driver.findElement(By.cssSelector("(a[value='DEL'])[2]")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
	}

}
