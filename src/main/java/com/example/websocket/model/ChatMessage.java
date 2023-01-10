package com.example.websocket.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChatMessage {

    private String content;
    private String sender;

    public enum MessageType{
        CHAT, LEAVE, JOIN
    }
}
