
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fromMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://www.makemytrip.com/");
System.out.println(driver.findElement(By.cssSelector(".multiCitySearchDepart1")).isDisplayed());
driver.findElement(By.cssSelector("#multicity > label:nth-child(2)")).click();
System.out.println(driver.findElement(By.cssSelector(".multiCitySearchDepart1")).isDisplayed());
//System.out.println(driver.findElement(By.cssSelector(".multiCySearchDepart1")).isDisplayed());
int count = driver.findElements(By.cssSelector(".multiCiSearchDepart1")).size();
if (count ==0)
{
	System.out.println("Verified");
}


		
	}

}
