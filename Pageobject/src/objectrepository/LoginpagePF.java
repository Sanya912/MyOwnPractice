package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePF {
	WebDriver driver;
	
	
	
	public LoginpagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
/*
	By username =By.xpath("//*[@id=\'login1\']");
	By password =By.xpath("//*[@id=\'password\']");
	By submit = By.name("proceed");
	By home = By.linkText("Home");
	*/
	
	@FindBy(xpath="//*[@id=\'login1\']")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\\'password\\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\\'password\\']")
	WebElement submit;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	
	
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
