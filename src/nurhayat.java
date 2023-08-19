import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class nurhayat extends BaseDriver {

    @Test
    public void Test() {

        // WaitAndQuit() - 5 saniye bekle ve çık
        // MyFunc.Wait(1); - 1 saniye bekle
        String kAdi = ("nurqatester8@gmail.com");
        String sKey = ("147741Nd.");
        driver.get("https://www.akakce.com/");

        WebElement giris = driver.findElement(By.xpath("//*[@href='/akakcem/giris/']"));
        giris.click();
        MyFunc.Wait(2);
        WebElement mail = driver.findElement(By.xpath("(//*[@type='email'])[2]"));
        mail.sendKeys(kAdi);
        MyFunc.Wait(2);

        WebElement sifre = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        sifre.sendKeys(sKey);
        MyFunc.Wait(2);

        WebElement gir = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        gir.click();
        MyFunc.Wait(2);

        WebElement hesap = driver.findElement(By.xpath("//*[@title='Hesabım']"));
        hesap.click();
        MyFunc.Wait(2);

        WebElement cikis = driver.findElement(By.xpath("//*[@href='#Çık']"));
        cikis.click();
        MyFunc.Wait(2);

        WebElement giris2 = driver.findElement(By.xpath("//*[@href='/akakcem/giris/']"));
        giris2.click();
        MyFunc.Wait(2);

       // Assert.assertFalse("Cıkış yapıldı", false);


        WaitAndQuit();
    }
}




