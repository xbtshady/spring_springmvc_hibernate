package com.ssh.respository;

/**
 * Created by Administrator on 2018/3/26.
 */


public class weiboMessage {
    private int id;
    private String date;
    private String message;

    public weiboMessage(int id,String date,String message){
        this.id = id;
        this.date = date;
        this.message = message;
    }
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "date: " + date +
                "message " + message;
    }
}
