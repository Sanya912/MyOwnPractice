import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");	
		//int framecount = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(framecount);
		
		
	}
	public void switchToFrame(WebDriver driver)
	{
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);
		for(int i=0; i<framecount; i++ ) {
			driver.switchTo().frame(i);
			int count = driver.findElements(By.tagName("iframe")).size();
		} 
		if(count>0) {
			driver.findElement(By.className("//div[@class='rc-anchor-center-item rc-anchor-checkbox-holder']")).click();
		}
	}

}
