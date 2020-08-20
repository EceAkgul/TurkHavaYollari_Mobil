package org.example;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import util.Methods;

public class StepImp extends Methods {


    @Step({"<seconds> saniye bekle", "Wait <second> seconds"})
    public void waitBySecond(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step({"<element> ID li  elementi bul ve tıkla"})
    public void clickElementByID(String key) {
        MobileElement element = findElement(key);
        clictToElement(element);

    }

    @Step({"<key> ID li elementi bul ve <element> degerini yaz"})
    public void sendKeyByID(String key, String element) {

        driver.findElementById(key).sendKeys(element);
    }


    @Step({"<key> Xpath li elementi bul ve tıkla"})
    public void clickElementByXpath(String key) {
        driver.findElementByXPath(key).click();
    }

    @Step("<key> ile <text> değeri uyuşuyor mu kontrol et")
    public void isTextEqual(String key, String text){
        MobileElement element = findElement(key);
        getTextControl(element, text);
    }

}