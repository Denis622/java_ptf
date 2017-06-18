package ru.stqa.pft.addressbook.models;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;

    public ContactData(String firstName, String middleName, String lastName, String nickName, String title) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }
}
