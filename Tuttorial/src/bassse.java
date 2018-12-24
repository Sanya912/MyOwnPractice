import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class bassse {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		File f =  new File("src"); //source folder
		//File fs = new File(f, "ApiDemos-debug.apk");
		File fs = new File(f, "Raaga Hindi Tamil Telugu songs and podcasts_v8.0.2_apkpure.com.apk");
		
		
		
		
		
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;

	}

}
