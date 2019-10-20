package com.codemoshtutorial;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal("Bill",500,28,"male");

        animal.animalInfo();
        animal.eat();
        animal.sleep();

        Bird bird = new Bird("Jed", 3, 10, "male");
        Fish fish = new Fish("Susie", 1, 3, "female");



        Chicken chick = new Chicken("Chuck", 4, 10, "femaile");

        chick.fly();



    }
}
