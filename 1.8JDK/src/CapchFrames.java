import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapchFrames { //Did not finish 83-85 in the course

	public static void main(String[] args) {
		// Code for capcha, xpath Blabla
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carparts.com/");
		int number = findFramenumber(driver, By.xpath("blablablaCapcha"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("blablablaCapcha")).click();
	}
	
	
	
	
	
	
	public static int findFramenumber(WebDriver driver, By by ) {
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		
		for(i=0; i<framecount; i++)
		{
			driver.switchTo().frame(i);	
			
			int count = driver.findElements(by).size();
			
			if(count>0) 
			{	
			break;
			}
			else
			{
				System.out.println("continue looping");
			}
		}		
	driver.switchTo().defaultContent();	
	return i;
	}
}