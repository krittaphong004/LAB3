package com.example.myapplication;

public class USER {
    String name;
    String editdate;
    String createdate;

    void write() {
        System.out.println("Name: " + name);
        System.out.println("Edit on: " + editdate);
        System.out.println("Created on: " + createdate);
    }
}