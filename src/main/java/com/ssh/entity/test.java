package com.ssh.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2018/3/21.
 */
public class test {

    public static void main(String[] args) {
        //creating configuration object
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file

        //creating seession factory object
        SessionFactory factory=cfg.buildSessionFactory();

        //creating session object
        Session session=factory.openSession();

        //creating transaction object
        Transaction t=session.beginTransaction();

        Person p1=new Person();
        p1.setId(5);
        p1.setAge(221);
        p1.setFirst("Maax");
        p1.setLast("Sua");

        User user = new User();

        session.persist(p1);//persisting the object

        t.commit();//transaction is committed
        session.close();

        System.out.println("successfully saved");
    }
}
