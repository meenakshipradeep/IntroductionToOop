package com.company;

public class Main {

    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.Sleep();

        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();


        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot parru = new Parrot("Parru", "I am Colorful");
        parru.speak();

        parru.spin();
        parru.doTheCaterpillar();
        parru.jump();

    }
}
