package MegaplanTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Klient {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void Klient() {
        wd.get("https://ra.testoplan.ru/login/?backUrl=/");
        wd.findElement(By.id("login")).click();
        wd.findElement(By.id("login")).clear();
        wd.findElement(By.id("login")).sendKeys("magellan");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("staff_multipass");
        wd.findElement(By.id("mp-btn_default-login")).click();
        wd.findElement(By.cssSelector("button._1Xoix_R2aerEmG7xO98Pdg._2CmDYstegKO-Xu9bkmN5sb")).click();
        wd.findElement(By.xpath("//div[@class='_3tYYfkjqXTAsDI0U_tc6-f']/div[2]/div/div/div/div/div[1]/input")).click();
        wd.findElement(By.xpath("//div[@class='_3tYYfkjqXTAsDI0U_tc6-f']/div[2]/div/div/div/div/div[1]/input")).clear();
        wd.findElement(By.xpath("//div[@class='_3tYYfkjqXTAsDI0U_tc6-f']/div[2]/div/div/div/div/div[1]/input")).sendKeys("Bdfy");
        wd.findElement(By.xpath("//div[@class='_3tYYfkjqXTAsDI0U_tc6-f']/div[9]/div/div/div/div/div[1]/div/div[1]/input")).click();
        wd.findElement(By.xpath("//div[@class='_3tYYfkjqXTAsDI0U_tc6-f']/div[9]/div/div/div/div/div[1]/div/div[1]/input")).clear();
        wd.findElement(By.xpath("//div[@class='_3tYYfkjqXTAsDI0U_tc6-f']/div[9]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("qwerty");
        wd.findElement(By.xpath("//div[@class='R0HCCLjxkbyhTc2GOQx4J']//button[.='  Создать  ']")).click();
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
