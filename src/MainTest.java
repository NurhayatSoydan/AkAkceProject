import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MainTest extends BaseDriver {

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

        System.out.println("LoginTestPositive = Current email ile girilen email uyumlu.");
        System.out.println("LoginTestPositive = Sistem'e başarılı bir şekilde giriş yapıldı.");
        System.out.println("Test PASSED");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNegative() {

        String eMail = "Studyyytecho@gmail.com";
        String password = "123AsdminiqqQQ";
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

        System.out.println("Ekrana hatalı şifre uyarısı geldi.");
        System.out.println("LoginTestNegative = Sisteme giriş yapılamadı.");
        System.out.println("Test PASSED");

        WaitAndQuit();
    }

    @Test
    public void LoginTestNull() {

        String eMail = "";
        String password = "";

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

        System.out.println("LoginTestNull = Sisteme giriş yapılamadı.");

        WaitAndQuit();
    }
}
