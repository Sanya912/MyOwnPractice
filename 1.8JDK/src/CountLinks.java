
	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class CountLinks {




		public static void main(String[] args) {
			
			// Wait until expected condition
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.dice.com");
			
			//Count all links. Every time a TagName
			//System.out.println(driver.findElements(By.tagName("a")).size());
			
			//Count links in footer or in some part of the page
			WebElement ddriver = driver.findElement(By.xpath("//*[@id=\'dice-everywhere\']/div"));
			System.out.println(ddriver.findElements(By.tagName("a")).size());
			
			for (int i=1; i<ddriver.findElements(By.tagName("a")).size();i++)  {
				
				//open all links in separae tabs
				String ClickOnlink = Keys.chord(Keys.CONTROL, Keys.ENTER);	
				ddriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnlink);
			}
				Set<String> abc = driver.getWindowHandles();
				Iterator <String> it = abc.iterator();
				
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
					
				}
				
				}
				
			
			}
			
			
