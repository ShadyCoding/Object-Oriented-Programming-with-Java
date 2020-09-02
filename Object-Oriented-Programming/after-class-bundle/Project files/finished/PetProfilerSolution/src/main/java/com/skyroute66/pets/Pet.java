package com.skyroute66.pets;

public abstract class Pet {
    
    // properties:
    
    protected String name = "";
    protected int age = 0;

    private int ageMultiplier = 1;
    
    // constructor
    
    public Pet(String someName, int someAge) {
        name = someName;
        age = someAge;
    }

    public Pet(String someName, int someAge, int someMultiplier) {
        name = someName;
        age = someAge;
        ageMultiplier = someMultiplier;
    }
    
    // methods
    
    public String selfDescribe() {
        return "Hello, my name is " + name + ". I am " + calculateRealAge() + " in human years.";
    }
    
    public int calculateRealAge() {
        return age * ageMultiplier;
    }
    
}
