package com.cst2355.lab04gui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity  extends AppCompatActivity {
    //initializing variables and arrays for messages.
    List<Message> MsgList = new ArrayList<>();
    ListView listView;
    EditText editTxt;
    Button SendBtn;
    Button ReceiveBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);

        //connect to respective values in the layouts
        listView = (ListView)findViewById(R.id.ListViewer);
        editTxt = (EditText)findViewById(R.id.EditSendTxt);
        SendBtn = (Button)findViewById(R.id.SendBtn);
        ReceiveBtn = (Button)findViewById(R.id.ReceiverBtn);

        SendBtn.setOnClickListener(c -> {
            String msg = editTxt.getText().toString();
            Message MsgAct = new Message(msg, true);
            MsgList.add(MsgAct);
            editTxt.setText("");
            Adapter adapter = new Adapter(MsgList, getApplicationContext());
            listView.setAdapter(adapter);
        });

        ReceiveBtn.setOnClickListener(c -> {
            String msg = editTxt.getText().toString();
            Message MsgAct = new Message(msg, false);
            MsgList.add(MsgAct);
            editTxt.setText("");
            Adapter adapter = new Adapter(MsgList, getApplicationContext());
            listView.setAdapter(adapter);
        });



    }
}
