package com.example.rosan.myapplication.Model;

/**
 * Created by Dell on 3/18/2018.
 */

public class UserMessage {
    private String name, lastmssage, time;

    public UserMessage(String name, String lastmssage, String time) {
        this.name = name;
        this.lastmssage = lastmssage;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastmssage() {
        return lastmssage;
    }

    public void setLastmssage(String lastmssage) {
        this.lastmssage = lastmssage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "name='" + name + '\'' +
                ", lastmssage='" + lastmssage + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
