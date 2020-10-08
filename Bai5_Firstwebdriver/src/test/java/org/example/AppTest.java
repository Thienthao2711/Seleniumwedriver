package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
      /*  System.setProperty("webdriver.gecko.driver", "D:\\Webdriver\\geckodriver.exe");*/
        /*WebDriver driver = new FirefoxDriver();*/
        WebDriver driver=new ChromeDriver();
        driver.get("http://testmaster.vn/Account/Login?ReturnUrl=%2fadmin");
        driver.manage().window().maximize();

        //Actions/Steps
        WebElement txtinputuser = driver.findElement(By.cssSelector("[placeholder='E-mail đăng nhập']"));
        txtinputuser.sendKeys("khanh.tx@live.com"); //Nhap mot chuoi
        WebElement txtinputpass = driver.findElement(By.cssSelector("input[type='password']"));
        txtinputpass.sendKeys("abc123"); //Nhap mot chuoi

        WebElement dangnhap=  driver.findElement(By.cssSelector("button[type='button']"));
        dangnhap.click();
        String actual =driver.getTitle();

        String expected="Login - Testmaster.vn";


        //Test
        //Lay ket qua thuc te, so sanh voi ket qua gia thiet. Neu dung => Pass, neu khong thi False
//        String expected = "testmaster.vn";
//        String actual = driver.getTitle();
       Assert.assertTrue(actual.startsWith(expected));

    }
}
