import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_update_resume {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dice.com/dashboard/profiles/active");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("melikhov912@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Jordan48@");
		driver.findElement(By.xpath("//*[@id=\'loginDataSubmit\']/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\'editProfile\']")).click();
		
		driver.findElement(By.id("resumeFileInput")).sendKeys("D:\\Resume_Oleksandr_Melikhov4.docx");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.getWindowHandle(); //HANDLE THE POP UP WINDOW with skills
	
		driver.findElement(By.xpath("//*[@id=\"parse-resume-confirm-modal\"]/div/div/div[3]/button[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\'currentEmployment0\']")).click();
		driver.findElement(By.xpath("//*[@id=\'profileForm\']/div/div/div[4]/div/div/div/div[1]/div[4]/div/button")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //check
		driver.get("https://www.careerbuilder.com/user/profile");
		driver.findElement(By.xpath("//*[@id=\'cbsys_login_email\']")).sendKeys("melikhov912@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'cbsys_login_password\']")).sendKeys("Jordan23");
		driver.findElement(By.xpath("//*[@id=\'btnsigninemp\']")).click();
		driver.findElement(By.xpath("//*[@id=\'save-changes\']")).click();
		
		
		driver.quit();
		
		

	}

}
