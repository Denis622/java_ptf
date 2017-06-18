package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.models.ContactData;

/**
 * Created by Denis on 18.06.2017.
 */
public class ContactHelper extends HelperBase{

    private NavigationHelper navigationHelper;

    public ContactHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//*[@id='content']//input[@value='Enter']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillTheContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());

        type(By.name("middlename"), contactData.getMiddleName());

        type(By.name("lastname"), contactData.getLastName());

        type(By.name("nickname"), contactData.getNickName());

        type(By.name("title"), contactData.getTitle());

    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initNewContact() {
        click(By.linkText("add new"));
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void goHome() {
        click(By.linkText("home"));
    }

    public void editForm() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
        click(By.xpath("//*[@id='content']//input[@value='Update']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }
}
