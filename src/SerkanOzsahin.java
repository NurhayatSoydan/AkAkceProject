import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SerkanOzsahin extends BaseDriver {

    // Oturum Açma, Mesaj Kutusu Kontrolü, SearchBox Test Method'ları :

    // Oturum Açma :

    @Test
    public void LoginTestPositive() {

        String eMail = "studyyytecho@gmail.com";
        String password = "123asdminiqqQQ";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement myProfile = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        MyFunc.Wait(1);

        Actions action = new Actions(driver);
        Action action1 = action.moveToElement(myProfile).build();
        action1.perform();
        MyFunc.Wait(1);

        WebElement myAcc = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        myAcc.click();
        MyFunc.Wait(1);

        WebElement confirmEmail = driver.findElement(By.xpath("//a[text()='Eposta Adresimi Güncelle']"));
        confirmEmail.click();
        MyFunc.Wait(1);

        WebElement currentEmail = driver.findElement(By.xpath("//p[@id='umec']"));
        currentEmail.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Mevcut e-mail ile, girilen e-mail uyumlu değil. Test FAILED", currentEmail.getText().contains(eMail));

        WebElement myProfile2 = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        MyFunc.Wait(1);

        Actions actionA = new Actions(driver);
        Action action2 = actionA.moveToElement(myProfile2).build();
        action2.perform();
        MyFunc.Wait(1);

        WebElement myAcc2 = driver.findElement(By.xpath("//a[text()='Çık']"));
        myAcc2.click();
        MyFunc.Wait(1);

        System.out.println("\u001B[94mLoginTestPositive = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı ve şifre doğru girildi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestPositive = \u001B[0m" + "\u001B[32m" + "Mevcut e-mail ile, girilen e-mail uyumlu." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestPositive = \u001B[0m" + "\u001B[32m" + "Sisteme başarılı bir şekilde giriş yapıldı." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestPositive = \u001B[0m" + "\u001B[32m" + "Sistemden başarılı bir şekilde çıkış yapıldı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNegative1() {

        String eMail = "studyyytecho123@gmail.com";
        String password = "123asdminiqqQQ123";
        String hataliId = "Böyle bir kullanıcı yok.";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement error = driver.findElement(By.xpath("//p[text()='Böyle bir kullanıcı yok.']"));
        error.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Kullanıcı adı ve şifre yanlış girilmesine rağmen sisteme giriş yapıldı. Test FAILED", error.getText().contains(hataliId));

        System.out.println("\u001B[94mLoginTestNegative1 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı ve şifre yanlış girildi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative1 = \u001B[0m" + "\u001B[32m" + "Ekrana böyle bir kullanıcı yok uyarısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative1 = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNegative2() {

        String eMail = "studyyytecho@gmail.com";
        String password = "123asdminiqqQQ123";
        String hataliSifre = "Şifre doğru değil";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement error = driver.findElement(By.xpath("//p[text()='Şifre doğru değil. Lütfen kontrol edip yeniden deneyin.']"));
        error.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Kullanıcı adı doğru, şifre yanlış girilmesine rağmen sisteme giriş yapıldı. Test FAILED", error.getText().contains(hataliSifre));

        System.out.println("\u001B[94mLoginTestNegative2 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı doğru, şifre yanlış girildi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative2 = \u001B[0m" + "\u001B[32m" + "Ekrana hatalı şifre uyarısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative2 = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNegative3() {

        String eMail = "studyyytecho123@gmail.com";
        String password = "123asdminiqqQQ";
        String hataliId = "Böyle bir kullanıcı yok.";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement error = driver.findElement(By.xpath("//p[text()='Böyle bir kullanıcı yok.']"));
        error.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Kullanıcı adı yanlış, şifre doğru girilmesine rağmen sisteme giriş yapıldı. Test FAILED", error.getText().contains(hataliId));

        System.out.println("\u001B[94mLoginTestNegative3 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı yanlış, şifre doğru girildi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative3 = \u001B[0m" + "\u001B[32m" + "Ekrana böyle bir kullanıcı yok uyarısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative3 = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNull1() {

        String eMail = "";
        String password = "";
        String bosEmail = "Lütfen e-posta adresinizi yazın.";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement error2 = driver.findElement(By.xpath("//p[text()='Lütfen e-posta adresinizi yazın.']"));
        error2.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Kullanıcı adı ve şifre boş bırakılmasına rağmen sisteme giriş yapıldı. Test FAILED", error2.getText().contains(bosEmail));

        System.out.println("\u001B[94mLoginTestNull1 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı ve şifre boş bırakıldı." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull1 = \u001B[0m" + "\u001B[32m" + "Ekrana lütfen e-posta adresinizi yazın uyarısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull1 = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNull2() {

        String eMail = "";
        String password = "123asdminiqqQQ";
        String bosEmail = "Lütfen e-posta adresinizi yazın.";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement error2 = driver.findElement(By.xpath("//p[text()='Lütfen e-posta adresinizi yazın.']"));
        error2.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Kullanıcı adı boş bırakılmasına rağmen sisteme giriş yapıldı. Test FAILED", error2.getText().contains(bosEmail));

        System.out.println("\u001B[94mLoginTestNull2 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı boş bırakıldı, şifre doğru girildi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull2 = \u001B[0m" + "\u001B[32m" + "Ekrana lütfen e-posta adresinizi yazın uyarısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull2 = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginNullTest3() {

        String eMail = "studyyytecho@gmail.com";
        String password = "";
        String bosEmail = "Lütfen şifrenizi yazın.";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement error2 = driver.findElement(By.xpath("//p[text()='Lütfen şifrenizi yazın.']"));
        error2.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Şifre boş bırakılmasına rağmen sisteme giriş yapıldı. Test FAILED", error2.getText().contains(bosEmail));

        System.out.println("\u001B[94mLoginTestNull3 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı doğru girildi, şifre boş bırakıldı." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull3 = \u001B[0m" + "\u001B[32m" + "Ekrana lütfen şifrenizi yazın uyarısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull3 = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    // Mesaj Kutusu Kontrolü :

    @Test
    public void MesajKutuTest() {

        String eMail = "studyyytecho@gmail.com";
        String password = "123asdminiqqQQ";
        String noMsg = "Listelenecek mesaj bulunamadı.";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement logInBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        logInBtn.click();
        MyFunc.Wait(1);

        WebElement eMailLogIn = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        eMailLogIn.sendKeys(eMail);
        MyFunc.Wait(1);

        WebElement passwordLogIn = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordLogIn.sendKeys(password);
        MyFunc.Wait(1);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Giriş yap']"));
        submitBtn.click();
        MyFunc.Wait(1);

        WebElement myProfile = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        MyFunc.Wait(1);

        Actions action = new Actions(driver);
        Action action1 = action.moveToElement(myProfile).build();
        action1.perform();
        MyFunc.Wait(1);

        WebElement myAcc = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        myAcc.click();
        MyFunc.Wait(1);

        WebElement mesajBtn = driver.findElement(By.xpath("//a[text()='Mesajlarım']"));
        mesajBtn.click();
        MyFunc.Wait(1);

        WebElement mesajYok = driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));
        mesajYok.getText();
        MyFunc.Wait(1);

        Assert.assertTrue("Mesaj kutusu boş olmasına rağmen listelenecek mesaj bulunamadı yazısı ekrana gelmedi. Test FAILED.", mesajYok.getText().contains(noMsg));

        System.out.println("\u001B[94mMesajKutuTest = \u001B[0m" + "\u001B[32m" + "Sisteme başarıyla giriş yapıldı." + "\u001B[0m");
        System.out.println("\u001B[94mMesajKutuTest = \u001B[0m" + "\u001B[32m" + "Ekrana listelenecek mesaj bulunamadı yazısı geldi." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    // SearchBox :

    @Test
    public void SearchBoxTest() {

        String keyWord = "laptop";

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        MyFunc.Wait(1);

        new Actions(driver).moveToElement(searchBox).click().sendKeys(keyWord).sendKeys(Keys.ENTER).build().perform();
        MyFunc.Wait(1);

        String gidilenUrl = driver.getCurrentUrl();
        MyFunc.Wait(1);

        Assert.assertTrue("Anahtar kelime, gidilen URL'de bulunamadı. Test FAILED.", gidilenUrl.contains(keyWord));

        System.out.println("\u001B[94mSearchBoxTest = \u001B[0m" + "\u001B[32m" + "Anahtar kelime searchbox'a yazıldı." + "\u001B[0m");
        System.out.println("\u001B[94mSearchBoxTest = \u001B[0m" + "\u001B[32m" + "Yazılan anahtar kelime ile ilgili ürünler başarıyla listelendi." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }
}
