//package com.ssh.respository.impl;
//
//import com.ssh.entity.Person;
//import com.ssh.respository.PersonRepository;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
//@Repository
//public class PersonRepositoryImpl implements PersonRepository {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    private Session getCurrentSession() {
//        return this.sessionFactory.openSession();
//    }
//
//    public Person load(Long id) {
//        return (Person)getCurrentSession().load(Person.class,id);
//    }
//
//    public Person get(Long id) {
//        return (Person)getCurrentSession().get(Person.class,id);
//    }
//
//}
