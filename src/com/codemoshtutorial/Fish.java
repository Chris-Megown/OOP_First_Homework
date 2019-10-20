package com.codemoshtutorial;

public class Fish extends Animal {

    public Fish(String name, int weightInLbs, int age, String gender){
        this.name = name;
        this.weightInLbs = weightInLbs;
        this.age = age;
        this.gender = gender;
    }

    public void swim(){
        System.out.println("Swimming...");

    }
}
