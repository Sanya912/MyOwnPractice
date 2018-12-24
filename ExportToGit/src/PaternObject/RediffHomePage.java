package PaternObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
	WebDriver driver;
	
	
	
	public RediffHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//By videos = By.xpath("//*[@id=\'homewrapper\']/div[5]/a[5]/div"); 
	
	@FindBy(xpath="//*[@id=\'homewrapper\']/div[5]/a[5]/div")
	WebElement videos;

	

	
	public WebElement Videos() {
		return driver.findElement(videos);
	}


}
