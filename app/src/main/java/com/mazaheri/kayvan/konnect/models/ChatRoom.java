package com.mazaheri.kayvan.konnect.models;

/**
 * Created by kayvan on 7/11/15.
 */

import java.security.Timestamp;
import java.util.ArrayList;

/**
 * A conversation is a ChatRoom with only 2 users in it.
 */

public class ChatRoom {

    private ArrayList<User> participants;
    private ArrayList<Message> conversation;

    private Timestamp creationTime;

    private String _id;                 // used to uniquely identify the ChatRoom

    public ChatRoom(ArrayList<User> participants) {
        this.participants = participants;
    }

    public boolean isConversation(){
        return participantsCount() == 2;
    }

    public String get_id() {
        return _id;
    }

    private int participantsCount(){
        return participants.size();
    }

    public ArrayList<Message> getConversation()
    {
        return conversation;
    }

    public ArrayList<User> getParticipants() {
        return participants;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    private boolean containsUser(User user)
    {
        return participants.contains(user);
    }

    public boolean addParticipant(User user)
    {
        //TODO security and authentication stuff - adding a new user
        if(containsUser(user)){
            return false;
        }
        else{
            participants.add(user);
            return true;
        }
    }

    protected boolean addMessage(Message message){
        //TODO security and authentication stuff - adding a new message
        if(message.isValid()){
            conversation.add(message);
            return true;
        }
        return false;
    }

}
