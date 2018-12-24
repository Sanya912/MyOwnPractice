import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		
public class DropBoxFrontier {

	public static void main(String[] args) throws IOException {

				System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.aa.com/");
				//Static dropdown
				Select drop1 = new Select(driver.findElement(By.xpath("//*[@id=\'flightSearchForm.adultOrSeniorPassengerCount\']")));
				drop1.selectByVisibleText("2");
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("d:/drop.jpeg"));
						//File srcg=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        //FileUtils.copyFile(srcg, new File("d:/ss.png"));
			

		
		
		
		
		
		
	}

}
