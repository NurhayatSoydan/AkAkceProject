import Utility.BaseDriver;
import Utility.MyFunc;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SerkanSengul extends BaseDriver {
    @Test
    public void HesapDogrulamaKontrol() {
        driver.get("https://www.akakce.com/");

        WebElement HesapAc = driver.findElement(By.xpath("//div[@id='H_rl_v8']//a"));
        HesapAc.click();
        MyFunc.Wait(1);

        WebElement Name = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
        Name.sendKeys("Serkan");
        MyFunc.Wait(1);

        WebElement surname = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
        surname.sendKeys("Uza");
        MyFunc.Wait(1);

        WebElement email = driver.findElement(By.xpath("(//*[@type='email'])[3]"));
        email.sendKeys("TechnoStudyTeam__32_@gmail.com");
        MyFunc.Wait(1);

        WebElement againEmail = driver.findElement(By.xpath("(//*[@type='email'])[4]"));
        againEmail.sendKeys("TechnoStudyTeam__32_@gmail.com");
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.xpath("(//*[@class='frm_v8'])[8]//*"));
        password.sendKeys("KOBE21tmac");
        MyFunc.Wait(1);

        WebElement againpassoword = driver.findElement(By.xpath("(//*[@type='password'])[3]"));
        againpassoword.sendKeys("KOBE21tmac");
        MyFunc.Wait(1);

        WebElement radiobutton = driver.findElement(By.xpath("(//*[@onclick='changeGenderChoice()'])[1]"));
        radiobutton.click();
        MyFunc.Wait(1);

        WebElement Webday = driver.findElement(By.xpath("(//*[@class='frm_v8 inl_v8']/*)[1]"));
        WebElement WebMonth = driver.findElement(By.xpath("(//*[@class='frm_v8 inl_v8']/*)[2]"));
        WebElement WebYear = driver.findElement(By.xpath("(//*[@class='frm_v8 inl_v8']/*)[3]"));
        MyFunc.Wait(1);
        Select day = new Select(Webday);
        Select Month = new Select(WebMonth);
        Select Year = new Select(WebYear);
        MyFunc.Wait(1);
        day.selectByVisibleText("23");
        Month.selectByVisibleText("4");
        Year.selectByVisibleText("1990");
        MyFunc.Wait(1);

        WebElement btn = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));
        btn.click();
        MyFunc.Wait(1);

        WebElement btn2 = driver.findElement(By.xpath("(//*[@type='checkbox'])[3]"));
        btn2.click();
        MyFunc.Wait(1);

        WebElement Confim = driver.findElement(By.xpath("(//*[@type='submit'])[3]"));
        Confim.click();
        MyFunc.Wait(1);

        WebElement checkhesap1 = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        checkhesap1.click();

        WebElement checkhesap = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        Assert.assertTrue("test başarısız oldu", checkhesap.getText().contains("Serkan"));
        System.out.println("Test başarılı bir şekilde gerçekleşti");
        MyFunc.Wait(1);

        WebElement personeldetails = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/bilgi-guncelle/']"));
        personeldetails.click();
        MyFunc.Wait(1);

        WebElement phonenumber = driver.findElement(By.xpath("(//*[@type='text'])[4]"));
        phonenumber.sendKeys("5555922507");
        MyFunc.Wait(1);

        WebElement uptadebutton = driver.findElement(By.cssSelector("[type='submit']"));
        uptadebutton.click();
        MyFunc.Wait(1);

        WebElement button2 = driver.findElement(By.xpath("//button[@class='bt_v8 line_v8']/b"));
        button2.click();

        WaitAndQuit();

    }

    @Test
    public void SiparisListe() {
        driver.get("https://www.akakce.com/");
        WebElement Girisyap = driver.findElement(By.xpath("//*[@href='/akakcem/giris/'][1]"));
        Girisyap.click();
        MyFunc.Wait(1);

        WebElement Email = driver.findElement(By.xpath("(//*[@type='email'])[2]"));
        Email.sendKeys("TechnoStudyTeam_3@gmail.com");
        MyFunc.Wait(1);

        WebElement Password = driver.findElement(By.xpath("(//*[@type='password'])[1]"));
        Password.sendKeys("KOBE21tmac");
        MyFunc.Wait(1);

        WebElement girisyap2 = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        girisyap2.click();
        MyFunc.Wait(1);

        WebElement UsernameClick = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        UsernameClick.click();
        MyFunc.Wait(1);

        WebElement MyShoplists = driver.findElement(By.cssSelector("[href='/akakcem/siparislerim/']"));
        MyShoplists.click();

        WebElement result = driver.findElement(By.cssSelector("[class='no-record']"));
        Assert.assertTrue(result.getText().contains("Kayıtlı siparişiniz bulunmuyor."));
        System.out.println("sepetiniz boş yazısı gözüküyor");
        driver.navigate().back();
        MyFunc.Wait(1);

        WebElement Caydanlik = driver.findElement(By.cssSelector("[alt='Arçelik CM 9922 Eternity 1650 W Çelik Çay Makinesi']"));
        Caydanlik.click();
        MyFunc.Wait(1);

        WebElement followitem = driver.findElement(By.xpath("(//*[@class='ufo_v8'])[1]"));
        followitem.click();
        MyFunc.Wait(1);

        WebElement followbutton = driver.findElement(By.xpath("(//*[@rel='nofollow'])[7]"));
        followbutton.click();
        MyFunc.Wait(1);

        WebElement order1 = driver.findElement(By.cssSelector("[title='Arçelik CM 9922 Eternity 1650 W Çelik Çay Makinesi']"));
        Assert.assertTrue(order1.getText().contains("Arçelik"));
        System.out.println("Takip ettiklerin içersinde ürün gözüküyor");

        driver.navigate().back();
        MyFunc.Wait(1);

        WebElement unfollow = driver.findElement(By.xpath("(//*[@class='ufo_v8 a'])[1]"));
        unfollow.click();
        MyFunc.Wait(1);

        WebElement unfollowclick = driver.findElement(By.xpath("(//*[@class='bt_v8'])[9]"));
        unfollowclick.click();

        MyFunc.Wait(1);
        WebElement liste = driver.findElement(By.xpath("(//*[@rel='nofollow'])[2]"));
        liste.click();

        MyFunc.Wait(1);
        WebElement listefollow = driver.findElement(By.xpath("(//*[@href='/akakcem/takip-listem/'])[1]"));
        listefollow.click();

        MyFunc.Wait(1);
        WebElement read = driver.findElement(By.xpath("//*[@class='empty-follow-list']/*"));
        MyFunc.Wait(1);

        Assert.assertTrue(read.getText().contains("Takip"));
        System.out.println("Liste tekrardan boş olarak gözüküyor");

        WaitAndQuit();


    }

    @Test
    public void BaskaSiteyeGitme() {


        driver.get("https://www.akakce.com/");
        WebElement Girisyap = driver.findElement(By.xpath("//*[@href='/akakcem/giris/'][1]"));
        Girisyap.click();
        MyFunc.Wait(1);

        WebElement Email = driver.findElement(By.xpath("(//*[@type='email'])[2]"));
        Email.sendKeys("TechnoStudyTeam_3@gmail.com");
        MyFunc.Wait(1);

        WebElement Password = driver.findElement(By.xpath("(//*[@type='password'])[1]"));
        Password.sendKeys("KOBE21tmac");
        MyFunc.Wait(1);

        WebElement girisyap2 = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        girisyap2.click();
        MyFunc.Wait(1);

        WebElement urun = driver.findElement(By.xpath("(//img[@alt='Xiaomi Mi TV Stick " +
                "4K Dolby Chromecast Android TV Medya Oynatıcı'])[1]"));
        urun.click();
        MyFunc.Wait(1);


        WebElement urunegit = driver.findElement(By.xpath("(//span[@class='bt_v8']/*)[1]"));
        urunegit.click();
        MyFunc.Wait(2);


        Assert.assertTrue(driver.getCurrentUrl().contains("xiaomi"));
        System.out.println("Yeni sitede ürün gözüküyor");

        WaitAndQuit();
    }

    @Test
    public void EnTakipedilenurunleriGorebilme_1Sayfa_() {
        driver.get("https://www.akakce.com/");
        WebElement Girisyap = driver.findElement(By.xpath("//*[@href='/akakcem/giris/'][1]"));
        Girisyap.click();
        MyFunc.Wait(1);

        WebElement Email = driver.findElement(By.xpath("(//*[@type='email'])[2]"));
        Email.sendKeys("TechnoStudyTeam_3@gmail.com");
        MyFunc.Wait(1);

        WebElement Password = driver.findElement(By.xpath("(//*[@type='password'])[1]"));
        Password.sendKeys("KOBE21tmac");
        MyFunc.Wait(1);

        WebElement girisyap2 = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        girisyap2.click();
        MyFunc.Wait(1);

        WebElement urunleregit = driver.findElement(By.xpath("(//img[@src='//cdn.akakce.com/t.gif'])[4]"));
        urunleregit.click();
        MyFunc.Wait(1);

        List<WebElement> urunler = driver.findElements(By.cssSelector("[class='pl_v9 gv_v9']"));
        for (WebElement s : urunler) {
            System.out.println(s.getText());
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("en-cok"));

        WaitAndQuit();
    }
}
