package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.models.ContactData;
import ru.stqa.pft.addressbook.models.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    private NavigationHelper navigationHelper;

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//*[@id='content']//input[@value='Enter']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillTheContactForm(ContactData contactData, boolean creation) {

        type(By.name("firstname"), contactData.getFirstName());

        type(By.name("middlename"), contactData.getMiddleName());

        type(By.name("lastname"), contactData.getLastName());

        type(By.name("nickname"), contactData.getNickName());

        type(By.name("title"), contactData.getTitle());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
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

    public void returnToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("home page"));
    }

    public void editForm(int index) {

        if(!wd.findElements(By.xpath("//*[@id='content']//img[@title='Edit']")).get(index).isSelected()) {
            wd.findElements(By.xpath("//*[@id='content']//img[@title='Edit']")).get(index).click();
        }
    }

    public void submitContactModification() {
        click(By.xpath("//*[@id='content']//input[@value='Update']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.xpath("//*[@id='content']//input[@value='Delete']"));
    }

    public void createContact(ContactData contact, boolean creation) {
        initNewContact();
        fillTheContactForm(contact, creation);
        submitContactCreation();
        returnToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));

    }

    public List<ContactData> getContactList() {

        List<ContactData> contacts = new ArrayList<ContactData>();

        List<WebElement> firstNameElements = wd.findElements(By.cssSelector("[name='entry'] td:nth-child(3)"));
        List<WebElement> lastNamelements = wd.findElements(By.cssSelector("[name='entry'] td:nth-child(2)"));

        for (int i = 0; i < (firstNameElements.size() | lastNamelements.size()); i++) {
            String firstName = firstNameElements.get(i).getText();
            String lastName = lastNamelements.get(i).getText();
            ContactData contact = new ContactData(firstName, null, lastName, null, null, null);
            contacts.add(contact);
        }
        return contacts;
    }
}
