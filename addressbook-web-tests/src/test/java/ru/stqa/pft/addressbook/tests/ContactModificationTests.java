package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.ContactData;

/**
 * Created by Denis on 18.06.2017.
 */
public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification () {
        app.getContactHelper().goHome();
        app.getContactHelper().editForm();
        app.getContactHelper().fillTheContactForm(new ContactData("tes1", "tes2", "tes3", "tes4", "tes5"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToHomePage();
    }
}
