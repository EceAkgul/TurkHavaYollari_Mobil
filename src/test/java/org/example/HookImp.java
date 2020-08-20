package org.example;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class HookImp {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeScenario
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName" , "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("version", "7.0");
        caps.setCapability("appPackage", "com.turkishairlines.mobile");
        caps.setCapability("appActivity","com.turkishairlines.mobile.ui.ACSplash");
        caps.setCapability("autoGrantPermissions", true);
        caps.setCapability("autoDismissAlerts", true);
        caps.setCapability("autoAcceptAlerts", true);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
        System.out.println("Connecting...");
    }

    @AfterScenario
    public void teardown(){
        if(driver != null){
            driver.quit();
        }

    }
}
