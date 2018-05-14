package com.example.android.retrofit2.api.model;

/**
 * Created by Sergey Kulyk on 14.05.2018.
 */

public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private String[] topics;

    public User(String name, String email, int age, String[] topics) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.topics = topics;
    }

    public int getId() {
        return id;
    }
}
