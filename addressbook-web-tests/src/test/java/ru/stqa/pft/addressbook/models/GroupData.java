package ru.stqa.pft.addressbook.models;

public class GroupData {
    private final String name;
    private final String footer;
    private final String header;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        return name != null ? name.equals(groupData.name) : groupData.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "name='" + name + '\'' +
                '}';
    }

    public GroupData(String name, String footer, String header) {
        this.name = name;
        this.footer = footer;
        this.header = header;
    }

    public String getName() {
        return name;
    }

    public String getFooter() {
        return footer;
    }

    public String getHeader() {
        return header;
    }
}
