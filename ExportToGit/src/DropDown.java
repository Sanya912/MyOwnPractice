
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();;
		
		driver.get("https://www.alamo.com/en_US/car-rental/locations/us/philadelphia-pennsylvania.html");
		
		Select s= new Select(driver.findElement(By.id("_content_alamo_en_US_car_rental_reservation_start_res_widget_locations_jcr_content_content_start_pickUpDateTime_time")));
		s.selectByVisibleText("2:00am");
		driver.findElement(By.cssSelector("#_content_alamo_en_US_car_rental_reservation_start_res_widget_locations_jcr_content_content_start_pickUpLocation_searchCriteria")).sendKeys("Philadelphia, PA");
		
		Select drop = new Select(driver.findElement(By.id("_content_alamo_en_US_car_rental_reservation_start_res_widget_locations_jcr_content_content_start_dropOffDateTime_time")));
		driver.findElement(By.cssSelector("#_content_alamo_en_US_car_rental_reservation_start_res_widget_locations_jcr_content_content_start_dropOffDateTime_time"));
		drop.selectByVisibleText("10:00am");
		
		
	}

}
