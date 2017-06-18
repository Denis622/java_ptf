package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.models.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().initNewContact();
        app.getContactHelper().fillTheContactForm(new ContactData("tes1", "tes2", "tes3", "tes4", "tes5"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().returnToHomePage();

    }

}