import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarParts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carparts.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\'NewHeaderCart\']/a")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'NewHeaderCart\']/a")).isEnabled());
		
		//Select DP = new Select(driver.findElement(By.xpath("//*[@id=\'shopbybrand_brand\']")));
		//DP.selectByVisibleText("Dorman");
		
		
		
		//Screenshot
		//File srcg=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(srcg, new File("d:/ss.png"));
		
		driver.quit();
	
		
	}

	
}
