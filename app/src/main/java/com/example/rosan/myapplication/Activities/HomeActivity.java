package com.example.rosan.myapplication.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.rosan.myapplication.Adapter.UserMessageAdapter;
import com.example.rosan.myapplication.Model.UserMessage;
import com.example.rosan.myapplication.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<UserMessage> userMessageArrayList = new ArrayList<>();
    UserMessageAdapter userMessageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        UserMessage userMessage = new UserMessage("rosan", "hello", "9:40");
        userMessageArrayList.add(0, userMessage);


        userMessage = new UserMessage("rosan", "hello", "9:40");
        userMessageArrayList.add(1, userMessage);

        userMessage = new UserMessage("safal", "oi", "10:40");
        userMessageArrayList.add(2, userMessage);

        userMessage = new UserMessage("arush", "bye", "11:40");
        userMessageArrayList.add(3, userMessage);

        userMessage = new UserMessage("khatri", "hi", "12:40");
        userMessageArrayList.add(4, userMessage);

        userMessage = new UserMessage("oli", "haigasogs", "1:40");
        userMessageArrayList.add(5, userMessage);
        Log.d("list1", userMessageArrayList.toString());



        userMessageAdapter = new UserMessageAdapter(userMessageArrayList, HomeActivity.this);
        recyclerView.setAdapter(userMessageAdapter);
        userMessageAdapter.notifyDataSetChanged();
    }

}
