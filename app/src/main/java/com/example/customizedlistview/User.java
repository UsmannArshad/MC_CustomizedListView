package com.example.customizedlistview;

public class User {
    String name,lastMessage,lastmsgtime;
    int imageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastmsgtime() {
        return lastmsgtime;
    }

    public void setLastmsgtime(String lastmsgtime) {
        this.lastmsgtime = lastmsgtime;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public User(String name, String lastMessage, String lastmsgtime, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastmsgtime = lastmsgtime;
        this.imageId = imageId;
    }
}
