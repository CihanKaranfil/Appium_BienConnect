package bienConnect;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class GirisModulü {
    @Test
    public void test01() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "BienConnect.apk";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app", appUrl);
        //capabilities.setCapability("appPackage", "io.appium.android.apis");
        //capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos")

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);


        WebElement kullaiciAdi = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        kullaiciAdi.click();
        kullaiciAdi.sendKeys("Uyumsoft");
        WebElement sifre = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        sifre.click();
        sifre.sendKeys("Uyumsoft");

        WebElement girisYap = driver.findElement(AppiumBy.accessibilityId("Giriş Yap"));
        girisYap.click();
    }


    @Test
    public void test02() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "BienConnect.apk";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app", appUrl);
        //capabilities.setCapability("appPackage", "io.appium.android.apis");
        //capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);


        WebElement kullaiciAdi = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        kullaiciAdi.click();
        kullaiciAdi.sendKeys("Uyumsoft1");

        WebElement sifre = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        sifre.click();
        sifre.sendKeys("Uyumsoft");

        WebElement girisYap = driver.findElement(AppiumBy.accessibilityId("Giriş Yap"));
        girisYap.click();
    }

    @Test
    public void test03() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "BienConnect.apk";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app", appUrl);
        //capabilities.setCapability("appPackage", "io.appium.android.apis");
        //capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);


        WebElement kullaiciAdi = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        kullaiciAdi.click();
        kullaiciAdi.sendKeys("Uyumsoft");

        WebElement sifre = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        sifre.click();
        sifre.sendKeys("Uyumsoft1");

        WebElement girisYap = driver.findElement(AppiumBy.accessibilityId("Giriş Yap"));
        girisYap.click();
    }
}
