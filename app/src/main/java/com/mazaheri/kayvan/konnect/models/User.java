package com.mazaheri.kayvan.konnect.models;

import java.util.ArrayList;

/**
 * Created by kayvan on 7/11/15.
 */
public class User {
    private String username;            // unique identifier
    private String email;
    private String screenName;          // what is shown everywhere

    private ArrayList<ChatRoom> chats;
    private ArrayList<User> contacts;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public ArrayList<ChatRoom> getChats() {
        return chats;
    }
}
