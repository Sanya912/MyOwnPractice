

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://accounts.google.com/signup");
		
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("/html/body/div[1]/div/footer/ul/li[1]/a")).click();
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		 
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println("Switching back");
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
