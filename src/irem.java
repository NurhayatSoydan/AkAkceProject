import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class irem extends BaseDriver {
     @Test
             public void HesapAcmaKapatma(){






        driver.get("https://www.akakce.com/");
        WebElement hesap=driver.findElement(By.xpath("(//a[text()='Hesap Aç'])[1]"));
        hesap.click();
        MyFunc.Wait(2);

       WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("irem");

        MyFunc.Wait(2);

    WebElement soyad = driver.findElement(By.xpath("//input[@name='rnufs']"));
        soyad.sendKeys("torun");

        MyFunc.Wait(2);

    WebElement mail = driver.findElement(By.xpath("//input[@name='rnufe1']"));
        mail.sendKeys("iremt8202@gmail.com");
        MyFunc.Wait(2);

    WebElement mailtkr = driver.findElement(By.xpath("//input[@name='rnufe2']"));
        mailtkr.sendKeys("iremt8202@gmail.com");
        MyFunc.Wait(2);

    WebElement sifre = driver.findElement(By.cssSelector("[name='rnufp1']"));
        sifre.sendKeys("gtfeggh123AB");
        MyFunc.Wait(2);

    WebElement sifretkr = driver.findElement(By.xpath("//input[@name='rnufp2']"));
        sifretkr.sendKeys("gtfeggh123AB");
        MyFunc.Wait(2);

    WebElement cinsiyet = driver.findElement(By.xpath("//input[@id='rngf']"));
        cinsiyet.click();
        MyFunc.Wait(2);

    WebElement il = driver.findElement(By.xpath("//select[@class='s' and @name='locpr']"));
        il.sendKeys("Ankara");
        MyFunc.Wait(2);

    WebElement ilce = driver.findElement(By.cssSelector("select[class='s'][name='locds']"));
        ilce.sendKeys("Çankaya");
        MyFunc.Wait(2);

    WebElement gun = driver.findElement(By.xpath("//select[@class='t' and @name='bd']"));
        gun.sendKeys("9");
        MyFunc.Wait(2);

    WebElement ay = driver.findElement(By.xpath("//select[@name='bm' and @class='t']"));
        ay.sendKeys("2");
        MyFunc.Wait(2);

    WebElement yil = driver.findElement(By.xpath("//select[@name='by' and @class='t']"));
        yil.sendKeys("2000");
        MyFunc.Wait(2);

   WebElement gizlilik=driver.findElement(By.cssSelector("input[type='checkbox'][name='rnufpca']"));
    gizlilik.click();
    MyFunc.Wait(2);

        WebElement kpy = driver.findElement(By.cssSelector("input[value='Hesap aç'][type='submit']"));
        kpy.click();
        MyFunc.Wait(2);



       WebElement ire=driver.findElement(By.xpath("(//a[text()='İrem'])"));
       ire.click();
       MyFunc.Wait(2);

       WebElement sil=driver.findElement(By.xpath("(//a[text()='Hesabımı Sil'])"));
       sil.click();
       MyFunc.Wait(2);

       WebElement sifr=driver.findElement(By.cssSelector("input[class='t']"));
       sifr.sendKeys("gtfeggh123AB");
       MyFunc.Wait(2);

       WebElement hsb=driver.findElement(By.cssSelector("input[type='submit']"));
       hsb.click();
       MyFunc.Wait(2);

       WaitAndQuit();

}















}
