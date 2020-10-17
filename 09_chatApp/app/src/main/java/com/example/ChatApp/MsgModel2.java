package com.example.ChatApp;

import java.io.Serializable;

public class MsgModel2 implements Serializable {
    int type;
    String text;

    public MsgModel2(int type, String text){
        this.type= type;
        this.text= text;
    }
}
