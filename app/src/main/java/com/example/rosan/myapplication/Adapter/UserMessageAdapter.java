package com.example.rosan.myapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rosan.myapplication.Model.UserMessage;
import com.example.rosan.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Dell on 3/18/2018.
 */

public class UserMessageAdapter extends RecyclerView.Adapter<UserMessageAdapter.MyViewHolder> {

    ArrayList<UserMessage> userMessageArrayList;
    Context context;

    public UserMessageAdapter(ArrayList<UserMessage> userMessages, Context context) {
        this.userMessageArrayList = userMessages;
        Log.d("list", userMessages.toString());
        this.context = context;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView name, lastmsg, time;

        public MyViewHolder(View v) {
            super(v);
            imageView = v.findViewById(R.id.img);
            name = v.findViewById(R.id.name);
            lastmsg = v.findViewById(R.id.lastmsg);
            time = v.findViewById(R.id.time);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.listitemlayout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        UserMessage userMessage = userMessageArrayList.get(position);
        Log.d("hello", userMessage.toString());
        holder.name.setText(userMessage.getName());
        holder.lastmsg.setText(userMessage.getLastmssage());
        holder.time.setText(userMessage.getTime());
    }

    @Override
    public int getItemCount() {
        return userMessageArrayList.size();
    }
}
