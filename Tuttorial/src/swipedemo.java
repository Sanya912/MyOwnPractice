import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class swipedemo extends bassse {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@content-desc='9']").click();
		WebElement FF = (driver.findElementByXPath("//*[@content-desc='15']"));
		//WebElement FFT = (driver.findElementByXPath("//*[@content-desc='25']"));
		TouchAction t = new TouchAction(driver);
		//t.longPress(FF).moveTo(FFT).perform();
		
		
		
		
		
		
		
		
	}

}
