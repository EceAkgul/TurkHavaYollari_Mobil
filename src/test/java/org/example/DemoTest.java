package org.example;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoTest {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;


    @Before
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

    @Test
    public void basicTest(){

        //Flight Butonuna tıklanır
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/acMain_btnBooking"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay"))).click();


        //Sabiha Gökçen
        MobileElement el5 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_llFrom");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el6.sendKeys("SAW");
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]");
        el12.click();


        //Esenboğa
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_tvToCode"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch"))).sendKeys("ESB");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        el3.click();

        //Tarih
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_rlDeparture"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.FrameLayout[7]/android.widget.TextView"))).click();
        MobileElement el13 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
        el13.click();

        //Yolcu
        MobileElement adult = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        adult.click();

        //Search Flight

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch"))).click();


        //Ekonomi Uçuşu Seçilir
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        el18.click();

        //Yolcu Bigileri
        MobileElement el20 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAddNewPassenger_etAddName");
        el20.sendKeys("ECE");
        MobileElement el21 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAddNewPassenger_etAddLastName");
        el21.sendKeys("AKGUL");
        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[2]");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAddNewPassenger_etAddDateOfBirth");
        el23.sendKeys("08/08/1997");
        MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[1]");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAddNewPassenger_etAddTCKN");
        el25.sendKeys("11111111111");
        MobileElement el26 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAddNewPassenger_btnAddPassenger");
        el26.click();

        MobileElement el29 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frPickPassenger_btnContinue");
        el29.click();









    }

    @After
    public void teardown(){
        if(driver != null){
            driver.quit();
        }

    }

}
