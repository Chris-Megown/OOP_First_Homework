package com.codemoshtutorial;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal("Bill","Giraffe",500,28,"male");

        animal.animalInfo();
        animal.eat();
        animal.sleep();

    }
}
