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

        WebElement ayarButton = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]"));
        ayarButton.click();

        WebElement canlıyaCekme = driver.findElement(AppiumBy.
                xpath("//android.widget.Switch"));
        canlıyaCekme.click();

        WebElement geriCıkma = driver.findElement(AppiumBy.
                xpath("//android.widget.Button"));
        geriCıkma.click();

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
        WebElement faturaNo = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        faturaNo.sendKeys("TST2024" + faker.number().digits(9));
        WebElement aliciBilgileri = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
        aliciBilgileri.click();
        Thread.sleep(2000);
        WebElement vknTckn = driver.findElement(AppiumBy.
                xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
        vknTckn.click();
        vknTckn.sendKeys("12312314455");Thread.sleep(1000);

        WebElement aliciadi = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
        aliciadi.click();
        aliciadi.sendKeys("Cihan");Thread.sleep(1000);

        clickGesture(driver, 240, 2140); //klavyeyi kapadık
        Thread.sleep(1000);

        WebElement aliciSoyadi = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[4]"));
        aliciSoyadi.click();
        aliciSoyadi.sendKeys("xxx");
        clickGesture(driver, 240, 2140); //klavyeyi kapadık

        WebElement sehirSecim = driver.findElement(AppiumBy.accessibilityId("Kahramanmaraş"));
        sehirSecim.click();
        Thread.sleep(1000);

        WebElement sehirSecim2 = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Ankara\"])[1]"));
        sehirSecim2.click();
        Thread.sleep(1000);


       WebElement mahalleSecim = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[8]"));
       mahalleSecim.click();
       mahalleSecim.sendKeys("Kızılay");
       Thread.sleep(2000);

        WebElement malHizmetMenu = driver.findElement(AppiumBy.
                xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[3]"));
        malHizmetMenu.click();
        Thread.sleep(1000);

        WebElement malHizmetSecim = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Mal / Hizmet\"]/android.view.View[1]"));
        malHizmetSecim.click();
        Thread.sleep(1000);
        WebElement malHizmetSecim2 = driver.findElement(AppiumBy.
                xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        malHizmetSecim2.click();
        malHizmetSecim2.sendKeys("Arac");

        WebElement miktar = driver.findElement(AppiumBy.xpath("(//android.widget.EditText[@text=\"0.0\"])[1]"));
        miktar.click();
        miktar.clear();
        miktar.sendKeys("1");
        Thread.sleep(2000);

        WebElement kdvOrani = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"0.0\"]"));
        kdvOrani.click();
        kdvOrani.clear();
        kdvOrani.sendKeys("20");
        clickGesture(driver, 240, 2140); //klavyeyi kapadık

        WebElement birimFiyat = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"0.0\"]"));
        birimFiyat.click();
        birimFiyat.clear();
        birimFiyat.sendKeys("10000");
        clickGesture(driver, 240, 2140); //klavyeyi kapadık

        WebElement kaydetButon = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Mal / Hizmet\"]/android.widget.Button"));
        kaydetButon.click(); //Fatura kayıt Edildi
        Thread.sleep(1000);

        WebElement toplamBilgileri = driver.findElement(AppiumBy
                .xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[6]"));
        toplamBilgileri.click();
        Thread.sleep(1000);

        clickGesture(driver, 960, 1800); //Üç çizgi
        Thread.sleep(1000);

        clickGesture(driver, 850, 1200); // gönder butonu
        clickGesture(driver, 850, 1200); // gönder butonu
    }
}
