package com.codemoshtutorial;

public class Animal {

    String name;
    int weightInLbs;
    int age;
    String gender;

    public Animal(String name, int weightInLbs, int age, String gender){
        this.name = name;
        this.weightInLbs = weightInLbs;
        this.age = age;
        this.gender = gender;
    }

    public Animal(){

    }

    public void animalInfo(){
        System.out.println(name + ",");
        System.out.println("weighs " + weightInLbs + "lbs,");
        System.out.println("is " + age + " years old,");
        System.out.println("and is a " + gender + "!");
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

}
