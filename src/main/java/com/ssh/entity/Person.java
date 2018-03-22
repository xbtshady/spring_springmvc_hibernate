package com.ssh.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2018/3/21.
 */
@Entity
@Table(name = "user")
public class Person {

    @Id
    private int id;
    private int age;
    private String first;
    private String last;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

}