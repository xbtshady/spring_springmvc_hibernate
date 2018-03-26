package com.ssh.respository.impl;

import com.ssh.respository.port;
import com.ssh.respository.weiboMessage;


public class portAImpl implements port {

    private weiboMessage weiboMessage;

    public portAImpl(weiboMessage weiboMessage) {
        this.weiboMessage = weiboMessage;
    }

    @Override
    public String getMessage() {
        return "A: " + weiboMessage.toString();
    }
}
