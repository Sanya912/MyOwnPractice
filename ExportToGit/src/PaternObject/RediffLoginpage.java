package PaternObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	WebDriver driver;
	
	
	
	public RediffLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By username =By.xpath("//*[@id=\'login1\']");
	By password =By.xpath("//*[@id=\'password\']");
	By submit = By.name("proceed");
	By home = By.linkText("Home");
	
	public WebElement Email() {
		return driver.findElement(username);
		
	}
	public WebElement Password() {
		return driver.findElement(password);
		
	}
	public WebElement Submit() {
		return driver.findElement(submit);
		
	}
	public WebElement HomeLink() {
		return driver.findElement(home);
		
	}

}
