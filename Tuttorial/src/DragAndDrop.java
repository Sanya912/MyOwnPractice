import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends bassse {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		WebElement A =  driver.findElementsByClassName("android.view.View").get(0);
		WebElement B =  driver.findElementsByClassName("android.view.View").get(1);
		TouchAction t = new TouchAction(driver);
		Thread.sleep(2000);
		t.longPress(A).moveTo(B).release().perform(); //DropandDrop
		
	}

}
