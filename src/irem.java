import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class irem extends BaseDriver {
     @Test
             public void HesapAcma(){






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

         WaitAndQuit();



}
   @Test
    public void HesapSilme(){
         String silmekontrol="Hesabın silindi.";
       driver.get("https://www.akakce.com/");
       WebElement giris= driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
       giris.click();
       MyFunc.Wait(2);





       WebElement ML=driver.findElement(By.cssSelector("input[class='t'][name='life']"));
       ML.sendKeys("iremt8202@gmail.com");
       MyFunc.Wait(2);

       WebElement SFR= driver.findElement(By.xpath("(//input[@type='password'])[1]"));
       SFR.sendKeys("gtfeggh123AB");
       MyFunc.Wait(2);




        WebElement Giris= driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        Giris.click();
        MyFunc.Wait(2);

        WebElement hsp=driver.findElement(By.cssSelector("a[title='Hesabım']"));
        hsp.click();
        MyFunc.Wait(2);




      WebElement HESAP= driver.findElement(By.xpath("//a[text()='Hesabım']"));
      HESAP.click();
      MyFunc.Wait(2);



       WebElement sil=driver.findElement(By.xpath("(//a[text()='Hesabımı Sil'])"));
       sil.click();
       MyFunc.Wait(2);

       WebElement sfr= driver.findElement(By.cssSelector("input[type='password']"));
       sfr.sendKeys("gtfeggh123AB");
       MyFunc.Wait(2);

       WebElement hsbsil= driver.findElement(By.cssSelector("input[value='Hesabımı sil']"));
       hsbsil.click();

       WebElement silindi= driver.findElement(By.xpath("//*[text()='Hesabın silindi.']"));
       Assert.assertTrue(silindi.getText().contains(silmekontrol));


     WaitAndQuit();


   }






       }














