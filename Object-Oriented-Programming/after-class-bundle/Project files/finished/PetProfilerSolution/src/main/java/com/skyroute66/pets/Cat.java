
package com.skyroute66.pets;

public class Cat extends Pet {
    
    // constructor
    
    public Cat(String someName, int someAge) {
        super(someName, someAge, 8);
    }
    
    // methods

    @Override public String selfDescribe() {
        return "Fun cat ready to party! " + super.selfDescribe();
    }    
}
