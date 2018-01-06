package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.ContactData;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getContactHelper().returnToHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(
                    new ContactData(
                            "tes1", "tes2", "tes3", "tes4", "tes5", "test1"),
                    true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.wd.switchTo().alert().accept();
    }
}
