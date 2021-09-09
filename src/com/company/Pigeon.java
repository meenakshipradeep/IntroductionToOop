package com.company;

public class Pigeon extends Bird{
    public Pigeon(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }

    @Override
    public void fly() {
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }
    public void Sleep() {
        System.out.println("I'm a sleeping pigeon");
    }

}
