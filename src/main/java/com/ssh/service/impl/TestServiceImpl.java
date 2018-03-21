package com.ssh.service.impl;

import com.ssh.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/21.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "hello ";
    }
}
