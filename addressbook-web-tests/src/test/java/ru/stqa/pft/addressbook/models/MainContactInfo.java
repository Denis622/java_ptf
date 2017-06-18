package ru.stqa.pft.addressbook.models;

public class MainContactInfo {
    private final String firstName;
    private final String lastName;
    private final String nickName;
    private final String address;
    private final String mail;

    public MainContactInfo(String firstName, String lastName, String nickName, String address, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.address = address;
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }
}
