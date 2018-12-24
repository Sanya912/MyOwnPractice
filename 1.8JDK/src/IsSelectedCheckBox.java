import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		//driver.findElement(By.xpath("//*[@id=\'partialHotelBooking-hp-package\']")).click();
		//Verify check box isSelected or not? True or False
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'partialHotelBooking-hp-package\']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'primary-header-activity\']")).isDisplayed());
		//No y at the end. No correct xpath
		int A = driver.findElements(By.xpath("//*[@id=\'primary-header-activit\']")).size();
		//System.out.println(A);
		if(A==0) {
			System.out.println("Verified NO Elements");
		}
		//Thread.sleep(1000L);
		System.out.println(driver.findElement(By.xpath("//*[@id=\'reasons-to-believe-banner\']/li[1]")).getText());
		driver.close();
	}

}
