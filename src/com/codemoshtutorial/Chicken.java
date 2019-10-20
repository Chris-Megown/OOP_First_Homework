package com.codemoshtutorial;

public class Chicken extends Bird{

    public Chicken(String name, int age, int weightInLbs, String gender){
        super(name, weightInLbs, age, gender);
    }

    // overriding the method defined in Bird
    public void fly(){
        System.out.println("not able to fly...");
    }
}
