package com.company;

public class Main {

    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.Sleep();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();

        Parrot parru = new Parrot("Parru", "I am Colorful");
        parru.speak();


    }
}
