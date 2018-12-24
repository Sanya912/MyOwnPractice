import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends bassse {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		//Tap or click. TouchActions
		TouchAction t=new TouchAction(driver);
		WebElement OSList = driver.findElementByXPath("//android.widget.TextView[@text='OS']");
		WebElement AppList = driver.findElementByXPath("//android.widget.TextView[@text='App']");
		//t.tap(tapOptions().withElement(element(OSList))).perform();
		
		t.press(OSList).perform();
		t.press(AppList).perform();
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='OS']").click();
		

	}

	

}
