package com.mazaheri.kayvan.konnect.models;

import java.security.Timestamp;
import java.util.ArrayList;

/**
 * Created by kayvan on 7/11/15.
 */
public class Message {
    
    private User sender;
    private Timestamp creationTime;
    private ChatRoom target;                    // not sure if it is necessary

    private String message;

    public Message(User sender, ChatRoom targetChatRoom, String message) {
        this.sender = sender;
        this.target = targetChatRoom;
        this.message = message;
    }

    public Message(User sender, User receiver, String message) {
        this.sender = sender;
        ArrayList<User> userList = new ArrayList<>();
        userList.add(sender);
        userList.add(receiver);
        this.target = new ChatRoom(userList);
        this.message = message;
    }


    public boolean isValid(){
        // TODO security stuff - validating a message
        return true;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public ChatRoom getTarget() {
        return target;
    }

    public User getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}
