import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Count of links on the page
		//2. Count in the footer
		//
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limited to one block or footer
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3. Create small driver on the web page (footer)
		WebElement coldriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		driver.findElement(By.id("openwindow")).click();
		//4.click on each link in the coloumn
		for(int i = 1; i<coldriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			//Thread.sleep(5000L);
		}
			
			Set<String> abc = driver.getWindowHandles();//4 windows
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		}


	}


