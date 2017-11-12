package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.models.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fellGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_footer"), groupData.getFooter());
        type(By.name("group_header"), groupData.getHeader());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            click(By.name("selected[]"));
        }
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void gotoAddNewContact() {
        click(By.name("add new"));
    }
}
