import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class  {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void () {
        wd.get("https://ra.testoplan.ru/login/");
        wd.findElement(By.id("login")).click();
        wd.findElement(By.id("login")).clear();
        wd.findElement(By.id("login")).sendKeys("Dzeni@mail.ru");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Dzeni@mail.ru");
        wd.findElement(By.id("mp-btn_default-login")).click();
        wd.findElement(By.id("Rectangle-710-Copy-10")).click();
        wd.findElement(By.cssSelector("button._1Xoix_R2aerEmG7xO98Pdg._2CmDYstegKO-Xu9bkmN5sb")).click();
        wd.findElement(By.xpath("//div[@class='_2xS3f7aXIwbRMwHZKQcF1j']/div[2]/div/div[1]/div/div/div[1]/div/div/div[1]/input")).click();
        wd.findElement(By.xpath("//div[@class='_2xS3f7aXIwbRMwHZKQcF1j']/div[2]/div/div[1]/div/div/div[1]/div/div/div[1]/input")).clear();
        wd.findElement(By.xpath("//div[@class='_2xS3f7aXIwbRMwHZKQcF1j']/div[2]/div/div[1]/div/div/div[1]/div/div/div[1]/input")).sendKeys("TestTask1");
        wd.findElement(By.cssSelector("div.public-DraftStyleDefault-block.public-DraftStyleDefault-ltr")).click();
        wd.findElement(By.xpath("//div[@class='_2xS3f7aXIwbRMwHZKQcF1j']/div[2]/div/div[4]/div/div/div/div/div/div[1]/div/div[2]/span/span")).click();
        wd.findElement(By.xpath("//div[15]/div/div/div[1]/div[2]/div[1]/div/div")).click();
        wd.findElement(By.xpath("//div[@class='_2xS3f7aXIwbRMwHZKQcF1j']/div[2]/div/div[5]/div/div/div/div/div/div[1]/div")).click();
        wd.findElement(By.xpath("//div[16]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")).click();
        wd.findElement(By.xpath("//div[@class='_2xS3f7aXIwbRMwHZKQcF1j']//label[.='Дедлайн']")).click();
        wd.findElement(By.xpath("//div[@class='R0HCCLjxkbyhTc2GOQx4J']//button[.='  Поставить задачу  ']")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
