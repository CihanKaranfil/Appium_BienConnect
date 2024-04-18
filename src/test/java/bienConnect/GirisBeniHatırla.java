package bienConnect;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class GirisBeniHatırla extends ReusableMethods {
    @Test
    public void test01() throws MalformedURLException, InterruptedException {
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

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);

        WebElement kullaiciAdi = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/" +
                        "android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        kullaiciAdi.click();
        kullaiciAdi.sendKeys("Uyumsoft");

        WebElement sifre = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]" +
                        "/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        sifre.click();
        sifre.sendKeys("Uyumsoft");

        WebElement beniHatirla = driver.findElement(AppiumBy.className("android.widget.CheckBox"));
        beniHatirla.click();

        WebElement girisYap = driver.findElement(AppiumBy.accessibilityId("Giriş Yap"));
        girisYap.click();
        Thread.sleep(3000);
        Thread.sleep(3000);

        //WebElement menuButton = driver.findElement(AppiumBy.className("android.widget.Button"));
        //menuButton.click();
        clickGesture(driver,536,2155);
       // clickGesture(driver,830,2155);

        clickGesture(driver,350,500);


    }
}
