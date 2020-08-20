package util;

import io.appium.java_client.MobileElement;
import org.example.DemoTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods extends DemoTest {

    public void getTextControl(MobileElement element, String key) {
        Assert.assertEquals("Eleman girilen texti içermiyor.", getTextElement(element), key);
        System.out.println("Girilen değer ile Elementin texti uyuşuyor..");
    }

    public String getTextElement(MobileElement element) {
        String elemaninTexti = "";
        elemaninTexti = element.getText();
        System.out.println("Elemanın Text değeri: " + elemaninTexti);
        return elemaninTexti;
    }

    public MobileElement findElement(String key) {
        try {
            MobileElement element = (MobileElement) (new WebDriverWait(driver, 5, 300))
                    .until(ExpectedConditions.elementToBeClickable(By.cssSelector(key)));
            return element;

        } catch (Exception ex) {
            Assert.fail("" + key + "'li element 10 saniye boyunca arandı fakat bulunamadı..!!!");
            return null;
        }
    }
    public void clictToElement(WebElement element) {
        element.click();
    }

}
