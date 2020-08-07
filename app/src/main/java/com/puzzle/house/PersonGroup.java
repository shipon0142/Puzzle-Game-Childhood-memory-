package com.puzzle.house;

public class PersonGroup {
    private String groupName;
    private String img;

    public PersonGroup(String groupName, String img) {
        this.groupName = groupName;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    private String groupCreatedTimestramp;
    private String groupJson;

    public PersonGroup(String groupName, String groupCreatedTimestramp, String groupJson) {
        this.groupName = groupName;
        this.groupCreatedTimestramp = groupCreatedTimestramp;
        this.groupJson = groupJson;
    }

    public PersonGroup() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupCreatedTimestramp() {
        return groupCreatedTimestramp;
    }

    public void setGroupCreatedTimestramp(String groupCreatedTimestramp) {
        this.groupCreatedTimestramp = groupCreatedTimestramp;
    }

    public String getGroupJson() {
        return groupJson;
    }

    public void setGroupJson(String groupJson) {
        this.groupJson = groupJson;
    }
}
