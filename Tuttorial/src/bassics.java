import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class bassics extends bassse{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		Thread.sleep(1000);
		driver.findElementByClassName("android.widget.CheckBox").click();
		Thread.sleep(1000);
		driver.findElementsByClassName("android.widget.LinearLayout").get(1).click();
		
		
	

	}

}
