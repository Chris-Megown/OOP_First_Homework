package com.codemoshtutorial;

public class Bird extends Animal {

    public Bird(String name, int weightInLbs, int age, String gender){
        this.name = name;
        this.weightInLbs = weightInLbs;
        this.age = age;
        this.gender = gender;
    }

    public void fly(){
        System.out.println("Flying...");
    }
}
