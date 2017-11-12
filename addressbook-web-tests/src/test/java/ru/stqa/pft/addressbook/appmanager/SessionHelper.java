package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.models.LoginToWebSite;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(LoginToWebSite loginToWebSite) {
        type(By.name("user"), loginToWebSite.getUsername());
        type(By.name("pass"), loginToWebSite.getPssword());

        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
