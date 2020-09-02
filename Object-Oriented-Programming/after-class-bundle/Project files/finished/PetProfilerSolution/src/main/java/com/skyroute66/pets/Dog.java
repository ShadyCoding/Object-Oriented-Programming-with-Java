package com.skyroute66.pets;

public class Dog extends Pet {
    
    // constructor
    
    public Dog(String someName, int someAge) {
        super(someName, someAge, 7);
    }
    
    // methods  

    @Override public String selfDescribe() {
        return "Fun dog looking to make friends! " + super.selfDescribe();
    }
}
