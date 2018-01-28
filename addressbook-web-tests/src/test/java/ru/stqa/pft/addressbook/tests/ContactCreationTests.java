package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        List<ContactData> before = app.getContactHelper().getContactList();

        ContactData contact = new ContactData(
                "Petr", "tes2", "Prokopovich", "tes4", "tes5", "test1"
        );
        app.getContactHelper().createContact(contact, true);

        List<ContactData> after = app.getContactHelper().getContactList();
        before.add(contact);

        Comparator<? super ContactData> byLastName = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
        before.sort(byLastName);
        after.sort(byLastName);

        Assert.assertEquals(after.size(), before.size());
        Assert.assertEquals(before, after);
    }
}