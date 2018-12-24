import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncroniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //***NEW**
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[3]/div/div/ul/li[1]/a/span[2]")).click();
		driver.findElement(By.cssSelector("#H-destination")).sendKeys("nyc");
		driver.findElement(By.cssSelector("#H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.cssSelector("#H-fromDate")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#enableDateless")).click();
		driver.findElement(By.cssSelector("#enableDateless")).sendKeys(Keys.ENTER);
		
		WebDriverWait d = new WebDriverWait(driver, 20); //emplicit wait d varib..
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'Westbury-Hotels-Hilton-Garden-Inn-Westbury')]")));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'Westbury-Hotels-Hilton-Garden-Inn-Westbury')]"))).click();
		// or next// driver.findElement(By.cssSelector("#\\39 88765 > div:nth-child(3) > div:nth-child(1) > a:nth-child(2)")).click();
		//driver.findElement(By.xpath("//a[contains(@href, 'Westbury-Hotels-Hilton-Garden-Inn-Westbury')]")).click();
		
		//**HOTEL will change**
				
	}

}
