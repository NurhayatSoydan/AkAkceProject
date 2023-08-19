import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SerkanOzsahin extends BaseDriver {

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

        Assert.assertTrue(currentEmail.getText().contains(eMail));

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
        System.out.println("\u001B[94mLoginTestPositive = \u001B[0m" + "\u001B[32m" + "Current email ile, girilen email uyumlu." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestPositive = \u001B[0m" + "\u001B[32m" + "Sisteme başarılı bir şekilde giriş yapıldı." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestPositive = \u001B[0m" + "\u001B[32m" + "Sistemden başarılı bir şekilde çıkış yapıldı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNegative1() {

        String eMail = "studyyytecho123@gmail.com";
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

        Assert.assertTrue(error.getText().contains(hataliSifre));

        System.out.println("\u001B[94mLoginTestNegative1 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı ve şifre yanlış girildi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative1 = \u001B[0m" + "\u001B[32m" + "Ekrana hatalı şifre uyarısı geldi." + "\u001B[0m");
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

        Assert.assertTrue(error.getText().contains(hataliSifre));

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

        Assert.assertTrue(error.getText().contains(hataliId));

        System.out.println("\u001B[94mLoginTestNegative3 = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı yanlış, şifre doğru girildi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative3 = \u001B[0m" + "\u001B[32m" + "Ekrana Böyle bir kullanıcı yok yazısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNegative3 = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNull() {

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

        Assert.assertTrue(error2.getText().contains(bosEmail));

        System.out.println("\u001B[94mLoginTestNull = \u001B[0m" + "\u001B[32m" + "Kullanıcı adı ve şifre boş bırakıldı." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull = \u001B[0m" + "\u001B[32m" + "Ekrana Lütfen e-posta adresinizi yazın uyarısı geldi." + "\u001B[0m");
        System.out.println("\u001B[94mLoginTestNull = \u001B[0m" + "\u001B[32m" + "Sisteme giriş yapılamadı." + "\u001B[0m");
        System.out.println("\u001B[32m" + "Test PASSED" + "\u001B[0m");

        WaitAndQuit();
    }
}
