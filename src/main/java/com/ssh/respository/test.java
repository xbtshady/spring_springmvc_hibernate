package com.ssh.respository;

import com.ssh.respository.impl.portAImpl;
import com.ssh.respository.impl.portBImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/3/26.
 */
public class test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/applicationContext.xml");
        port A = (port)context.getBean("portA");
        port B = (port)context.getBean("portB");

        System.out.println(A.getMessage());
        System.out.println(B.getMessage());
    }
}
