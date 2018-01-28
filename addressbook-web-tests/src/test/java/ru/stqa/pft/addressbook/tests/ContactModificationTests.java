package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {

        app.getNavigationHelper().goToHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(
                    new ContactData(
                            "Petr", "tes2", "Prokopovich", "tes4", "tes5", "test1"),
                    true);
        }

        List<ContactData> before = app.getContactHelper().getContactList();

        app.getContactHelper().editForm(before.size() - 1);
        ContactData contact = new ContactData(
                "Ivan", "tes2", "Ivanovsky", "tes4", "tes5", null
        );
        app.getContactHelper().fillTheContactForm(contact,false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();

        List<ContactData> after = app.getContactHelper().getContactList();

        before.remove(before.size() - 1);
        before.add(contact);

        Assert.assertEquals(after.size(), before.size());

        Comparator<? super ContactData> byLastName = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
        before.sort(byLastName);
        after.sort(byLastName);

        Assert.assertEquals(after, before);
    }
}
