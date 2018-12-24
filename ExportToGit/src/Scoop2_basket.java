
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scoop2_basket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://basket.com.ua/");
		
		//open all links in the block ***********************************************IMPOR
		WebElement minidriver = driver.findElement(By.xpath("//*[@id=\'center\']/div[1]"));
		for (int i= 1; i < minidriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			minidriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}
		Set<String> abcd = driver.getWindowHandles();
		Iterator<String> it = abcd.iterator();
		// click to all opened windows and take a title ************************Important
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
		}	
	}


