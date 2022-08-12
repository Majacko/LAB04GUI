package com.cst2355.lab04gui;

import androidx.appcompat.app.AppCompatActivity;

public class Message extends AppCompatActivity {
    //initializing variables
    public String msg;
    public boolean isSent;

    public Message(String msg, boolean isSent){//loads the constructor with initialized variables
        this.msg = msg;
        this.isSent = isSent;
    }
    
    public Message(){

    }

    //get,sets and boolean methods.
    public String getMsg(){return msg;}
    public void setMsg(String msg){this.msg=msg;}
    public boolean isSent(){return isSent;}
    public void setSent(boolean sent){isSent = sent;}


}
