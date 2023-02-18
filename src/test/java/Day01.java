import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Day01 {


    @Test
    public void test01() throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","13.0");
        desiredCapabilities.setCapability("deviceName","realDevice");
        desiredCapabilities.setCapability("automationName","Uiautomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\yasar\\IdeaProjects\\AppiumNw\\src\\Apps\\Calculator_8.3 (477856174)_Apkpure (2).apk");

        AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);


        driver.findElementById("com.google.android.calculator:id/digit_9").click();

        //inspector da locate yaparız. buraya alır testlerı run ederiz.
        Thread.sleep(2000);

        driver.findElementById("com.google.android.calculator:id/op_mul").click();
        Thread.sleep(2000);

        driver.findElementById("com.google.android.calculator:id/digit_5").click();

    }


}
