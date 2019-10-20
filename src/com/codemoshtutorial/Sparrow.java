package com.codemoshtutorial;

public class Sparrow extends Bird{

    public Sparrow(String name, int age, int weightInLbs, String gender){
        super(name, weightInLbs, age, gender);
    }

    public void fly(){
        System.out.println("Flying...");
    }
}
