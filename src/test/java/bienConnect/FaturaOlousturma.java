package bienConnect;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FaturaOlousturma extends ReusableMethods {
    Faker faker = new Faker();

    @Test
    public void test01() throws MalformedURLException, InterruptedException {
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
        //WebElement seneryoTipi = driver.findElement(AppiumBy.accessibilityId("Ticari"));
        //seneryoTipi.click()
        clickGesture(driver, 120, 555);
        Thread.sleep(1000);
        WebElement faturaNo = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
        faturaNo.sendKeys("CHN2024" + faker.number().digits(9));
        WebElement aliciBilgileri = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
        aliciBilgileri.click();
        Thread.sleep(2000);
        WebElement vknTckn = driver.findElement(AppiumBy.
                xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
        vknTckn.click();
        vknTckn.sendKeys("1111113284");
        Thread.sleep(1000);
        WebElement alici = driver.findElement(AppiumBy.accessibilityId("Alıcı"));
        alici.click();
        Thread.sleep(1000);
        WebElement ilkMail = driver.findElement(AppiumBy.accessibilityId("urn:mail:defaultpk@brusaseating.eu"));
        ilkMail.click();
        Thread.sleep(1000);
        WebElement sehirDdm = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[6]/android.widget.Button[2]"));
        sehirDdm.click();
        Thread.sleep(1000);
        WebElement sehirSecim = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Ankara\"])[1]"));
        sehirSecim.click();
        Thread.sleep(1000);
        WebElement mahalleSecim = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[7]"));
        mahalleSecim.click();
        mahalleSecim.sendKeys("Kızılay");
        Thread.sleep(1000);

        WebElement malHizmetMenu = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]"));
        malHizmetMenu.click();
        Thread.sleep(1000);

        WebElement malHizmetSecim = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Mal / Hizmet\"]/android.view.View[1]"));
        malHizmetSecim.click();
        Thread.sleep(2000);


        //clickGesture(driver, 660, 970);
        WebElement kdvOrani = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0.0\"])[2]"));
        kdvOrani.click();
        kdvOrani.clear();
        kdvOrani.sendKeys("20");

        WebElement miktar = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0.0\"])[1]"));
        miktar.click();
        miktar.clear();
        miktar.sendKeys("1");
        Thread.sleep(1000);

        clickGesture(driver, 200, 760);
        Thread.sleep(1000);

        clickGesture(driver, 115, 1870);
        clickGesture(driver, 370, 1700);
        clickGesture(driver, 115, 1870);
        clickGesture(driver, 430, 2030);
        clickGesture(driver, 115, 2330);
        Thread.sleep(2000);


        clickGesture(driver, 190, 1570);
        clickGesture(driver, 950, 2030);
        clickGesture(driver, 950, 2030);
        clickGesture(driver, 950, 2030);
        clickGesture(driver, 130, 1730);
        clickGesture(driver, 410, 2200);
        clickGesture(driver, 410, 2200);
        clickGesture(driver, 410, 2200);
        clickGesture(driver, 410, 2200);
        //WebElement kaydet = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Mal / Hizmet\"]/android.widget.Button"));
        //kaydet.click();
        clickGesture(driver, 960, 1350);

    }
}
