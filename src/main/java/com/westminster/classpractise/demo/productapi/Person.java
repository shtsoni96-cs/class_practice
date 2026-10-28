package com.westminster.classpractise.demo.productapi;

public class Person {
    private int id;
    private String name;
    private String birth_date;

    public Person(int id, String name, String birth_date) {
        this.id = id;
        this.name = name;
        this.birth_date =birth_date;
    }
    public String getPerson() {
        return id + ", " + name + ", " + birth_date;
    }
}
