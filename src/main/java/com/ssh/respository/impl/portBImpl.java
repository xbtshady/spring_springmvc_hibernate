package com.ssh.respository.impl;


import com.ssh.respository.port;
import com.ssh.respository.weiboMessage;


public class portBImpl implements port {

    private weiboMessage weiboMessage;

    public void setWeiboMessage(weiboMessage weiboMessage) {
        this.weiboMessage = weiboMessage;
    }

    @Override
    public String getMessage() {
        return "B: " + weiboMessage.toString();
    }
}
