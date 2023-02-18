import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Day01 {


    @Test
    public void test01() throws MalformedURLException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","13.0");
        desiredCapabilities.setCapability("deviceName","realDevice");
        desiredCapabilities.setCapability("automationName","Uiautomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\yasar\\IdeaProjects\\AppiumNw\\src\\Apps\\Calculator_8.3 (477856174)_Apkpure (2).apk");

        AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);




    }


}
