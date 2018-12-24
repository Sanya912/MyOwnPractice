import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Job_search_dice {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.dice.com/dashboard/profiles/active");
				driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("melikhov912@gmail.com");
				driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Jordan48@");
				driver.findElement(By.xpath("//*[@id=\'loginDataSubmit\']/div[3]/div/button")).click();
				driver.findElement(By.id("job")).sendKeys("Software Quality Assurance;  Quality Assurance;  Software;  Mobile Tester;  Testing");
				driver.findElement(By.id("location")).sendKeys("19136");
				driver.findElement(By.xpath("//*[@id=\"searchJob\"]/div/div[3]/input")).click();
				
				//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        //FileUtils.copyFile(src, new File("d:/ss.png"));
				
				}
	
	}


