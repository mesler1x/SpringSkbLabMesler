package ru.skblab.mesler.springskblabmesler.model;

public abstract class Animal {
    public int age;
    public String name;
    public void run() {
        System.out.println("running");
    }

    public void eat() {
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("sleeping");
    }
}
