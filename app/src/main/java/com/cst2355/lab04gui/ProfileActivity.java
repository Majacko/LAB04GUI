package com.cst2355.lab04gui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    Button ChatBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ChatBtn = (Button) findViewById(R.id.ChatBtn);
        ChatBtn.setOnClickListener(c ->{
            Intent goChatRoom = new Intent(ProfileActivity.this, ChatActivity.class);
            startActivity(goChatRoom);
        });
    }
}

