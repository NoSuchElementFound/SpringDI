package com.example.springdi;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        System.out.println("Person Constructor");
        this.name = name;
        this.age = age;
    }
}
