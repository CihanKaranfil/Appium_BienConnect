package bienConnect;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class eArsivOlusturma extends ReusableMethods {
    Faker faker = new Faker();

    @Test
    public void test01() throws InterruptedException, MalformedURLException {

        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources" + File.separator + "app-release.apk";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app", appUrl);

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
        Thread.sleep(3000);

        WebElement faturaOlustur = driver.findElement(AppiumBy.accessibilityId("Fatura Oluştur"));
        faturaOlustur.click();
        Thread.sleep(2000);

        clickGesture(driver, 120, 555); //Fatura no click
        Thread.sleep(1000);
        WebElement faturaNo = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
        faturaNo.sendKeys("TST2024" + faker.number().digits(9));
        WebElement aliciBilgileri = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
        aliciBilgileri.click();
        Thread.sleep(2000);
        WebElement vknTckn = driver.findElement(AppiumBy.
                xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
        vknTckn.click();
        vknTckn.sendKeys("12312314455");

        WebElement aliciadi = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
        aliciadi.click();
        aliciadi.sendKeys("Cihan");Thread.sleep(2000);

        clickGesture(driver, 240, 2140); //klavyeyi kapadık

        WebElement aliciSoyadi = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[4]"));
        aliciSoyadi.click();
        aliciadi.sendKeys("Cihan");





    }
}
