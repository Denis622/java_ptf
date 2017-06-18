package ru.stqa.pft.addressbook.models;

public class LoginToWebSite {
    private final String username;
    private final String pssword;

    public LoginToWebSite(String username, String pssword) {
        this.username = username;
        this.pssword = pssword;
    }

    public String getUsername() {
        return username;
    }

    public String getPssword() {
        return pssword;
    }
}
